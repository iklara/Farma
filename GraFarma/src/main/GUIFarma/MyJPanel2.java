package GUIFarma;
	import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JTextField;


	public class MyJPanel2 extends JPanel{
		

		
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension (800,800);
		}

			public MyJPanel2() {
				
				Font czcionka = new Font("Calabri",Font.BOLD, 12);
				Font czcionka1 = new Font("Calabri",Font.BOLD, 45);
				
				
				
				setLayout(null);
				
				JLabel etykieta = new JLabel();
				etykieta.setFont(czcionka1);
				etykieta.setText("Witaj na Farmie");
				etykieta.setBounds(250, 10, 500, 100);
				etykieta.setForeground(Color.BLUE);
				
				add(etykieta);
				

				JLabel etykieta1 = new JLabel();
				etykieta1.setFont(czcionka);
				etykieta1.setText("Gracz 1 - Twoja Farma");
				etykieta1.setBounds(150, 100, 200, 50);
				etykieta1.setForeground(Color.RED);
				
				add(etykieta1);
				
							
				JLabel etykieta2 = new JLabel();
				etykieta2.setFont(czcionka);
				etykieta2.setText("Gracz 2 - Twoja Farma ");
				etykieta2.setBounds(550, 100, 200, 50);
				etykieta2.setForeground(Color.blue);
				add(etykieta2);
				
								
				JButton button2 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button2.setBounds(100, 150, 50, 50);
				button2.isBackgroundSet();
				add(button2);
				JButton button3 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button3.setBounds(150, 150, 50, 50);
				button3.isBackgroundSet();
				add(button3);
				JButton button4= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button4.setBounds(200, 150, 50, 50);
				button4.isBackgroundSet();
				add(button4);
				JButton button5 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button5.setBounds(250, 150, 50, 50);
				button5.isBackgroundSet();
				add(button5);
				JButton button5a = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button5a.setBounds(300, 150, 50, 50);
				button5a.isBackgroundSet();
				add(button5a);
				
				
//				JFrame f=new JFrame("Button Example");            
//				JButton b=new JButton(new ImageIcon("D:\\icon.png"));    
//				b.setBounds(100,100,100, 40);    
//				f.add(b);    
//				f.setSize(300,400);    
//				f.setLayout(null);    
//				f.setVisible(true);       
				
	
				JButton button6 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));	
				button6.setBounds(500, 150, 50, 50);
				button6.isBackgroundSet();
				add(button6);
				JButton button7 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button7.setBounds(550, 150, 50, 50);
				button7.isBackgroundSet();
				add(button7);
				JButton button8 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button8.setBounds(600, 150, 50, 50);
				button8.isBackgroundSet();
				add(button8);
				JButton button9 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button9.setBounds(650, 150, 50, 50);
				button9.isBackgroundSet();
				add(button9);
				JButton button9a = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\rabbitSmall.jpg"));
				button9a.setBounds(700, 150, 50, 50);
				button9a.isBackgroundSet();
				add(button9a);
				

				JButton button10 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\sheepSmall.jpg"));	
				button10.setBounds(125, 200, 50, 50);
				button10.isBackgroundSet();
				add(button10);
				
				JButton button11 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\sheepSmall.jpg"));	
				button11.setBounds(175, 200, 50, 50);
				button11.isBackgroundSet();
				add(button11);
				
				JButton button12 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\sheepSmall.jpg"));	
				button12.setBounds(225, 200, 50, 50);
				button12.isBackgroundSet();
				add(button12);
				
				JButton button13 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\sheepSmall.jpg"));	
				button13.setBounds(275, 200, 50, 50);
				button13.isBackgroundSet();
				add(button13);
				
				
				JButton button14 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\sheepSmall.jpg"));	
				button14.setBounds(525, 200, 50, 50);
				button14.isBackgroundSet();
				add(button14);
				JButton button15 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\sheepSmall.jpg"));	
				
				button15.setBounds(575, 200, 50, 50);
				button15.isBackgroundSet();
				add(button15);
				JButton button16 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\sheepSmall.jpg"));	
				button16.setBounds(625, 200, 50, 50);
				button16.isBackgroundSet();
				add(button16);
				JButton button17 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\sheepSmall.jpg"));	
				button17.setBounds(675, 200, 50, 50);
				button17.isBackgroundSet();
				add(button17);
				
			
				
				JButton button18 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\swinkaSmall.png"));		
				button18.setBounds(150, 250, 50, 50);
				button18.isBackgroundSet();
				add(button18);
				JButton button19 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\swinkaSmall.png"));		
				button19.setBounds(200, 250, 50, 50);
				button19.isBackgroundSet();
				add(button19);
				JButton button20 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\swinkaSmall.png"));		
				button20.setBounds(250, 250, 50, 50);
				button20.isBackgroundSet();
				add(button20);
				
							
				JButton button23 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\swinkaSmall.png"));			
				button23.setBounds(550, 250, 50, 50);
				button23.isBackgroundSet();
				add(button23);
				
				JButton button24 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\swinkaSmall.png"));	
				button24.setBounds(600, 250, 50, 50);
				button24.isBackgroundSet();
				add(button24);
				JButton button25 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\swinkaSmall.png"));	
				button25.setBounds(650, 250, 50, 50);
				button25.isBackgroundSet();
				add(button25);
					
			
				JButton button27 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\cowSmall.png"));
				button27.setBounds(175, 300, 50, 50);
				button27.isBackgroundSet();
				add(button27);
				
				JButton button28 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\cowSmall.png"));
				button28.setBounds(225, 300, 50, 50);
				button28.isBackgroundSet();
				add(button28);
			
							
				JButton button31 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\cowSmall.png"));
				button31.setBounds(575, 300, 50, 50);
				button31.isBackgroundSet();
				add(button31);
				JButton button32 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\cowSmall.png"));
				button32.setBounds(625, 300, 50, 50);
				button32.isBackgroundSet();
				add(button32);
				
			
				
				JButton button36 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\funHSmall.jpg"));
				button36.setBounds(200, 350, 50, 50);
				button36.isBackgroundSet();
				add(button36);
				
						
				JButton button40 = new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\funHSmall.jpg"));
				button40.setBounds(600, 350, 50, 50);
				button40.isBackgroundSet();
				add(button40);
		
		
				JButton button42= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\dogSSmall.png"));
				button42.setBounds(100, 450, 100, 50);
				button42.isBackgroundSet(); // bloean if true zmienia kolor
				add(button42);
				JButton button43= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\bigDogSmall.png"));
				button43.setBounds(200, 450, 100, 50);
				button43.isBackgroundSet();
				add(button43);
				
				JButton button44= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\dogSSmall.png"));
				button44.setBounds(500, 450, 100, 50);
				button44.isBackgroundSet();
				add(button44);
				JButton button45= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\bigDogSmall.png"));
				button45.setBounds(600, 450, 100, 50);
				button45.isBackgroundSet();
				add(button45);
				
			
				// to jako popu ma byc if true
				JLabel etykieta15 = new JLabel();
				etykieta15.setFont(czcionka);
				etykieta15.setText("Spotka³eœ Lisa - tracisz króliki ");
				etykieta15.setBounds(50, 500, 200, 50);
				etykieta15.setForeground(Color.red);		
				add(etykieta15);
				JButton button46= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\foxS.png"));
				button46.setBounds(100, 550, 100, 50);
				button46.isBackgroundSet();
				add(button46);
				
				JLabel etykieta16 = new JLabel();
				etykieta16.setFont(czcionka);
				etykieta16.setText("Spotka³eœ Lisa - tracisz króliki ");
				etykieta16.setBounds(450, 500, 200, 50);
				etykieta16.setForeground(Color.red);		
				add(etykieta16);
				JButton button47= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\foxS.png"));
				button47.setBounds(500, 550, 100, 50);
				button47.isBackgroundSet();
				add(button47);
				
				JLabel etykieta17 = new JLabel();
				etykieta17.setFont(czcionka);
				etykieta17.setText("Spotka³eœ Wilka - tracisz wszystkie zwierzêta ");
				etykieta17.setBounds(50, 600, 400, 50);
				etykieta17.setForeground(Color.red);		
				add(etykieta17);
				JButton button48= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\WS.png"));
				button48.setBounds(200, 550, 100, 50);
				button48.isBackgroundSet();
				add(button48);
				
				JLabel etykieta18 = new JLabel();
				etykieta18.setFont(czcionka);
				etykieta18.setText("Spotka³eœ Wilka - tracisz wszystkie zwierzêta ");
				etykieta18.setBounds(450, 600, 400, 50);
				etykieta18.setForeground(Color.red);		
				add(etykieta18);
				
				JButton button49= new JButton(new ImageIcon("C:\\Users\\iwkar\\eclipse-workspace\\F\\src\\main\\resources\\WS.png"));
				button49.setBounds(600, 550, 100, 50);
				button49.isBackgroundSet();
				add(button49);
				
				
				
				
				
				
				JButton button = new JButton("Rzut kostk¹");
				button.setBounds(150, 700, 120, 50);
				add(button);
				
				JButton button1 = new JButton("Kup zwierzaka");
				button1.setBounds(450, 700, 120, 50);
				add(button1);
				
				
			}
		}

