package GUIFarma;
import javax.swing.JFrame;

import javafx.scene.layout.BackgroundImage;


	public class MyJFrame extends JFrame {

		public MyJFrame() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setLocation(150,150);
			setSize(1500, 1500);
			setTitle("Witaj na Farmie");
			
			
			
			
//			add(new MyJPanel());
			add(new MyJPanel2());
//			new backgroundImage();

			
			pack();
		}
	}
	
	
