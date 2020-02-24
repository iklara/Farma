package panels;

import javax.swing.*;
import java.awt.*;

public class EkranStartowy extends JPanel {

    private JLabel jLabel;


    public EkranStartowy() {
        setLayout(null);
        int wysokoscOkna = 600;
        int szerokoscOkna = 600;
        jLabel = new JLabel();
        jLabel.setText("Farma od Piotrka i Iwony");
        jLabel.setBounds(200, 200, 100, 100);

//        jLabel.setBounds((szerokoscOkna / 2), (int) (wysokoscOkna - (wysokoscOkna * 0.1)), szerokoscOkna, (int) (wysokoscOkna * 0.1));
        setSize(szerokoscOkna, wysokoscOkna);
        add(jLabel);


    }
}
