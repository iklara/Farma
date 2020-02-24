import frames.OknoGlowne;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                OknoGlowne oknoGlowne = new OknoGlowne();
            }
        });
    }
}
