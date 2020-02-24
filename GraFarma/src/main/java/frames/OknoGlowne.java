package frames;

import panels.EkranStartowy;

import javax.swing.*;
import java.awt.*;

public class OknoGlowne extends JFrame {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int wysokoscEkaranu = (int) screenSize.getHeight() - 50;
    private int szerokoscEkranu = (int) screenSize.getWidth() - 50;

    public OknoGlowne() {
        setTitle("Gra Farma");
        setVisible(true);
        setSize(szerokoscEkranu, wysokoscEkaranu);
        setLocation(20 , 0);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new EkranStartowy());

    }
}
