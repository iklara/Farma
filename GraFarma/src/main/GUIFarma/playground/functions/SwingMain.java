package playground.functions;

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
                window.addWindowStateListener(new WindowStateListener() {
                    @Override
                    public void windowStateChanged(WindowEvent e) {
                        frameState(e);
                    }
                });
                Music musicObject = new Music();
                String filePath = "GraFarma/src/main/resources/bensound-cute.wav";
                musicObject.playMusic(filePath, window);

            }

            public void frameState(WindowEvent event) {
                if ((event.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED) {
                    System.out.println("minimalizacja");
                } else if ((event.getNewState() & Frame.NORMAL) == Frame.NORMAL) {
                    System.out.println("normalneokno");
                }
            }
        });


    }


}