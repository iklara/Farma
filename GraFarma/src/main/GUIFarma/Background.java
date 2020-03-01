package GUIFarma;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.swing.JPanel;

public class Background extends JPanel{
	
		  private Image backgroundImage;

		  public Background(String fileName) throws IOException {
		    backgroundImage = ImageIO.read (new File( file:///C:/Users/iwkar/Downloads/cow_cow_face_cow_0%20(1).jpg));
		  }

		  public void paintComponent(Graphicsics g) {
		    super.paintComponent(g);

		    g.drawImage(backgroundImage, 0, 0, this);
		  }
		}


