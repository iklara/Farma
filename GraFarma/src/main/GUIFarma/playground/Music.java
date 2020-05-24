package playground;

import sun.util.resources.ms.CalendarData_ms_MY;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;


public class Music implements WindowListener{


    static JFrame frame;
    private WindowEvent event;

    public void WindowEvent() {
        frame.addWindowListener(this);

    }



    public void playMusic(String musicLocation)
    {
        try{
            File musicPath= new File (musicLocation);
            String staus;
            if (true ) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);


//                if ((event.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED) {
//                    System.out.println("minimalizacja");
//                    long clipTimePosition = clip.getMicrosecondPosition();
//                    clip.stop();
//                }
               // resume play przy otweiraniu
            //    clip.setMicrosecondPosition(clipTimePosition);
             //   clip.start();

// 3cie podejscie  z klasami

//                // Method to play the audio
//                public void play(){                {
//                    clip.start();
//                    status = "play";
//                }
//
//                public void pause(){
//                        {
//                            this.currentFrame =
//                                    this.clip.getMicrosecondPosition();
//                            clip.stop();
//                            status = "paused";
//                        }
//                public void resumeAudio() throws UnsupportedAudioFileException,
//                        IOException, LineUnavailableException
//
//                    clip.setMicrosecondPosition(currentFrame);
//                    this.play();
//                }


// 2gi podejscie z okienkiem
//
//               JOptionPane.showMessageDialog(null, "hit OK to pouse");
//                long clipTimePosition = clip.getMicrosecondPosition();
//                clip.stop();
//
//              JOptionPane.showMessageDialog(null, "hit OK to play");
//                clip.setMicrosecondPosition(clipTimePosition);
//                clip.start();





//            *****Muzic pauze attempt
//              public void frameState(WindowEvent event) {
//                    if ((event.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED) {
//                    System.out.println("minimalizacja");
//                        clipTimePosition = clip.getMicrosecondPosition();
//                    clip.stop();
//
//                    } else if ((event.getNewState() & Frame.NORMAL) == Frame.NORMAL) {
//                        System.out.println("normalneokno");
//                       clip.setMicrosecondPosition(clipTimePosition);
//                             clip.start();
//                    }



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
