package playground;

import sun.util.resources.ms.CalendarData_ms_MY;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;


public class Music implements WindowListener {


    static JFrame frame;

    public void WindowEvent() {
        frame.addWindowListener(this);

    }




    public void playMusic(String musicLocation)
    {
        try{
            File musicPath= new File (musicLocation);

            if (true ) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
//                clip.open(audioInput);
//                clip.start();
//                clip.loop(Clip.LOOP_CONTINUOUSLY);

//                Toolkit tk = frame.getToolkit();

//                 if ((tk.isFrameStateSupported(Frame.NORMAL))){
//                    clip.start();
//                    clip.loop(Clip.LOOP_CONTINUOUSLY);
//                }
//                if ((tk.isFrameStateSupported(Frame.ICONIFIED))) {
//                    long clipTimePosition = clip.getMicrosecondPosition();
//                    clip.stop();
//                }
//                else if ((tk.isFrameStateSupported(Frame.MAXIMIZED_BOTH))){
             //       clip.setMicrosecondPosition(clipTimePosition);
               //     clip.start();
            //    }

            } else {

               System.out.println("Muzyka nie znaleziona");
            }
        }catch (Exception Ex) {
            Ex.printStackTrace();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
