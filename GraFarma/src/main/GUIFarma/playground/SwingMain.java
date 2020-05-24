
import playground.Music;
import playground.MyJFrame;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;


public class SwingMain {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyJFrame window = new MyJFrame();
                String filePath = "bensound-cute.wav";

                Music musicObject = new Music() {
                };
                musicObject.playMusic(filePath);
                
                window.addWindowStateListener(new WindowStateListener() {
                    @Override
                    public void windowStateChanged(WindowEvent e) {
                        frameState(e);
                    }
                    public void frameState(WindowEvent event) {
                        if ((event.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED) {
                            System.out.println("minimalizacja");
                     //       musicObject.pauzeMusic(filePath);

                        } else if ((event.getNewState() & Frame.NORMAL) == Frame.NORMAL) {
                            System.out.println("normalneokno");
                        }

                                    }
                });

            }
        });
    }
}
