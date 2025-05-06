import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.AdjustmentListener;

public class TextEditor extends JFrame {
    JTextArea jTextArea;
    JScrollPane jScrollPane;
    JLabel jFontSizeLabel;
    JSpinner jFontSpinner;

    public TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("NeatPad");
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        jTextArea = new JTextArea();
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jTextArea.setFont(new Font("Calibri", Font.PLAIN, 20));
        System.out.println(jTextArea.getFont());
//        this.add(jTextArea);

        jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setPreferredSize(new Dimension(500,500));
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        jFontSizeLabel = new JLabel("Font Size: ");

        jFontSpinner = new JSpinner();
//        jFontSpinner.set
        jFontSpinner.setPreferredSize(new Dimension(40, 25));
        jFontSpinner.setValue(20);
        jFontSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jTextArea.setFont(new Font(jTextArea.getFont().getFamily(), Font.PLAIN,(int) jFontSpinner.getValue()));
            }
        });
        this.add(jFontSizeLabel);
        this.add(jFontSpinner);
        this.add(jScrollPane);
        this.setVisible(true);

    }

}
