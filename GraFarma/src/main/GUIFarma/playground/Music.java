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


    public void playMusic(String musicLocation, JFrame jFrame) {
        long soundStoper = 0;
        try {
            File musicPath = new File(musicLocation);
            Clip clip = AudioSystem.getClip();

            if (jFrame.getState() != Frame.ICONIFIED) {
                System.out.println(jFrame.getState());
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

            } else {
                soundStoper = clip.getMicrosecondLength();
                clip.stop();
                System.out.println("Muzyka nie znaleziona");
            }
        } catch (Exception Ex) {
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
