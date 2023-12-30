package code;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.speech.recognition.RecognizerModeDesc;
import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineStateError;
import javax.speech.recognition.GrammarException;
import javax.speech.recognition.Recognizer;
import javax.speech.recognition.RecognizerModeDesc;
import javax.speech.recognition.ResultAdapter;
import javax.speech.recognition.ResultEvent;
import javax.speech.recognition.ResultToken;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextToSpeechAndSpeechToText extends JFrame {


    public static void main(String[] args) {
        new TextToSpeechAndSpeechToText();
    }

    private static final String VOICES_KEY = "freetts.voices";
    private static final String VOICE_VALUE = "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory";
    private static final String CENTRAL_DATA = "com.sun.speech.freetts.jsapi.FreeTTSEngineCentral";

    private JTextArea textArea;
    private JButton speakButton;
    private JButton listenButton;

    private Recognizer recognizer;

    public TextToSpeechAndSpeechToText() {
        super("Text to Speech and Speech to Text");

        textArea = new JTextArea(10, 30);
        speakButton = new JButton("Speak");
        listenButton = new JButton("Listen");

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(textArea));
        panel.add(speakButton);
        panel.add(listenButton);

        speakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speakText();
            }
        });

        listenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    listenForSpeech();
                } catch (GrammarException | EngineStateError ex) {
                    ex.printStackTrace();
                } catch (AudioException | EngineException ex) {
                    ex.printStackTrace();
                }
            }
        });

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        initializeSpeechRecognition();
    }

    private void speakText() {
        String data = textArea.getText();
        try {
            System.setProperty(VOICES_KEY, VOICE_VALUE);
            Central.registerEngineCentral(CENTRAL_DATA);

            Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
            synthesizer.allocate();
            synthesizer.resume();
            synthesizer.speakPlainText(data, null);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.deallocate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void initializeSpeechRecognition() {
        try {
            System.setProperty("javax.speech.recognition.RecognizerModeDesc", "com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
            recognizer = Central.createRecognizer(new RecognizerModeDesc(Locale.US, rootPaneCheckingEnabled));
            recognizer.allocate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void listenForSpeech() throws GrammarException, EngineStateError, AudioException, EngineException {
        textArea.setText("Listening...");

        recognizer.addResultListener(new ResultAdapter() {
            @Override
            public void resultAccepted(ResultEvent e) {
                ResultToken resultToken = (ResultToken) e.getSource();
                if (resultToken != null) {
                    String resultText = resultToken.getSpokenText();
                    textArea.setText(resultText);
                }
            }
        });

        recognizer.commitChanges();
        recognizer.requestFocus();
        recognizer.resume();
    }
}
