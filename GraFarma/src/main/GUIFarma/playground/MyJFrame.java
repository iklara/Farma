
import playground.PlaygroundPane;

import javax.swing.*;
import java.awt.*;


public class MyJFrame extends JFrame {

    public MyJFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(50, 50);
        setSize(1500, 900);
        setTitle("Witaj na Farmie");
        Image icon = Toolkit.getDefaultToolkit().getImage("GraFarma/src/main/resources/foxS.png");
        setIconImage(icon);
//        setBackground(Color.GREEN);



//        add(new EkranPowitalny());
  // add(new MyJPanel2());
//			new backgroundImage();
       add(new PlaygroundPane());
      


        pack();
    }
}