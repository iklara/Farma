package GUIFarma;
	import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
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
				etykieta.setBounds(100, 10, 500, 100);
				etykieta.setForeground(Color.BLUE);
				
				add(etykieta);
				

				JLabel etykieta1 = new JLabel();
				etykieta1.setFont(czcionka);
				etykieta1.setText("Gracz 1 - Twoja Farma");
				etykieta1.setBounds(50, 100, 200, 50);
				etykieta1.setForeground(Color.RED);
				
				add(etykieta1);
				
							
				JLabel etykieta2 = new JLabel();
				etykieta2.setFont(czcionka);
				etykieta2.setText("Gracz 2 - Twoja Farma ");
				etykieta2.setBounds(450, 100, 200, 50);
				etykieta2.setForeground(Color.blue);
				add(etykieta2);
				
				JLabel etykieta3 = new JLabel();
				etykieta3.setFont(czcionka);
				etykieta3.setText("Królik");
				etykieta3.setBounds(50, 150, 100, 50);
				etykieta3.setForeground(Color.red);
				add(etykieta3);
				
					
				JButton button2 = new JButton("K");
				button2.setBounds(100, 150, 50, 50);
				button2.isBackgroundSet();
				add(button2);
				JButton button3 = new JButton("K");
				button3.setBounds(150, 150, 50, 50);
				button2.isBackgroundSet();
				add(button3);
				JButton button4 = new JButton("K");
				button4.setBounds(200, 150, 50, 50);
				button2.isBackgroundSet();
				add(button4);
				JButton button5 = new JButton("K");
				button5.setBounds(250, 150, 50, 50);
				button2.isBackgroundSet();
				add(button5);
				
				JLabel etykieta4 = new JLabel();
				etykieta4.setFont(czcionka);
				etykieta4.setText("Królik");
				etykieta4.setBounds(450, 150, 100, 50);
				etykieta4.setForeground(Color.blue);
				add(etykieta4);
							
				
				JButton button6 = new JButton("K");
				button6.setBounds(500, 150, 50, 50);
				button6.isBackgroundSet();
				add(button6);
				JButton button7 = new JButton("K");
				button7.setBounds(550, 150, 50, 50);
				button7.isBackgroundSet();
				add(button7);
				JButton button8 = new JButton("K");
				button8.setBounds(600, 150, 50, 50);
				button8.isBackgroundSet();
				add(button8);
				JButton button9 = new JButton("K");
				button9.setBounds(650, 150, 50, 50);
				button9.isBackgroundSet();
				add(button9);
				

				JLabel etykieta5 = new JLabel();
				etykieta5.setFont(czcionka);
				etykieta5.setText("Owca");
				etykieta5.setBounds(50, 200, 100, 50);
				etykieta5.setForeground(Color.red);
				add(etykieta5);
				
				JButton button10 = new JButton("O");
				button10.setBounds(100, 200, 50, 50);
				button10.isBackgroundSet();
				add(button10);
				JButton button11 = new JButton("O");
				button11.setBounds(150, 200, 50, 50);
				button11.isBackgroundSet();
				add(button11);
				JButton button12 = new JButton("O");
				button12.setBounds(200, 200, 50, 50);
				button12.isBackgroundSet();
				add(button12);
				JButton button13 = new JButton("O");
				button13.setBounds(250, 200, 50, 50);
				button13.isBackgroundSet();
				add(button13);
				
				JLabel etykieta6 = new JLabel();
				etykieta6.setFont(czcionka);
				etykieta6.setText("Owca");
				etykieta6.setBounds(450, 200, 100, 50);
				etykieta6.setForeground(Color.blue);
				add(etykieta6);
				
				JButton button14 = new JButton("O");
				button14.setBounds(500, 200, 50, 50);
				button14.isBackgroundSet();
				add(button14);
				JButton button15 = new JButton("O");
				button15.setBounds(550, 200, 50, 50);
				button15.isBackgroundSet();
				add(button15);
				JButton button16 = new JButton("O");
				button16.setBounds(600, 200, 50, 50);
				button16.isBackgroundSet();
				add(button16);
				JButton button17 = new JButton("O");
				button17.setBounds(650, 200, 50, 50);
				button17.isBackgroundSet();
				add(button17);
				
				JLabel etykieta7 = new JLabel();
				etykieta7.setFont(czcionka);
				etykieta7.setText("Œwinia");
				etykieta7.setBounds(50, 250, 100, 50);
				etykieta7.setForeground(Color.red);
				add(etykieta7);
				
				
				JButton button18 = new JButton("Œ");
				button18.setBounds(100, 250, 50, 50);
				button18.isBackgroundSet();
				add(button18);
				JButton button19 = new JButton("Œ");
				button19.setBounds(150, 250, 50, 50);
				button19.isBackgroundSet();
				add(button19);
				JButton button20 = new JButton("Œ");
				button20.setBounds(200, 250, 50, 50);
				button20.isBackgroundSet();
				add(button20);
				JButton button21 = new JButton("Œ");
				button21.setBounds(250, 250, 50, 50);
				button21.isBackgroundSet();
				add(button21);
				
				JLabel etykieta8 = new JLabel();
				etykieta8.setFont(czcionka);
				etykieta8.setText("Œwinia");
				etykieta8.setBounds(450, 250, 100, 50);
				etykieta8.setForeground(Color.blue);
				add(etykieta8);
				
				JButton button22 = new JButton("Œ");
				button22.setBounds(500, 250, 50, 50);
				button22.isBackgroundSet();
				add(button22);
				JButton button23 = new JButton("Œ");
				button23.setBounds(550, 250, 50, 50);
				button23.isBackgroundSet();
				add(button23);
				JButton button24 = new JButton("Œ");
				button24.setBounds(600, 250, 50, 50);
				button24.isBackgroundSet();
				add(button24);
				JButton button25 = new JButton("Œ");
				button25.setBounds(650, 250, 50, 50);
				button25.isBackgroundSet();
				add(button25);
				
				JLabel etykieta9 = new JLabel();
				etykieta9.setFont(czcionka);
				etykieta9.setText("Krowa");
				etykieta9.setBounds(50, 300, 100, 50);
				etykieta9.setForeground(Color.red);
				add(etykieta9);
				
				JButton button26 = new JButton("Kr");
				button26.setBounds(100, 300, 50, 50);
				button26.isBackgroundSet();
				add(button26);
				JButton button27 = new JButton("Kr");
				button27.setBounds(150, 300, 50, 50);
				button27.isBackgroundSet();
				add(button27);
				JButton button28 = new JButton("Kr");
				button28.setBounds(200, 300, 50, 50);
				button28.isBackgroundSet();
				add(button28);
				JButton button29 = new JButton("Kr");
				button29.setBounds(250, 300, 50, 50);
				button29.isBackgroundSet();
				add(button29);
				
				JLabel etykieta10 = new JLabel();
				etykieta10.setFont(czcionka);
				etykieta10.setText("Krowa");
				etykieta10.setBounds(450, 300, 100, 50);
				etykieta10.setForeground(Color.blue);
				add(etykieta10);
				
				JButton button30 = new JButton("Kr");
				button30.setBounds(500, 300, 50, 50);
				button30.isBackgroundSet();
				add(button30);
				JButton button31 = new JButton("Kr");
				button31.setBounds(550, 300, 50, 50);
				button31.isBackgroundSet();
				add(button31);
				JButton button32 = new JButton("Kr");
				button32.setBounds(600, 300, 50, 50);
				button32.isBackgroundSet();
				add(button32);
				JButton button33 = new JButton("Kr");
				button33.setBounds(650, 300, 50, 50);
				button33.isBackgroundSet();
				add(button33);
				
				JLabel etykieta11 = new JLabel();
				etykieta11.setFont(czcionka);
				etykieta11.setText("Koñ");
				etykieta11.setBounds(50, 350, 100, 50);
				etykieta11.setForeground(Color.red);
				add(etykieta11);
				
				JButton button34 = new JButton("Ko");
				button34.setBounds(100, 350, 50, 50);
				button34.isBackgroundSet();
				add(button34);
				JButton button35 = new JButton("Ko");
				button35.setBounds(150, 350, 50, 50);
				button35.isBackgroundSet();
				add(button35);
				JButton button36 = new JButton("Ko");
				button36.setBounds(200, 350, 50, 50);
				button36.isBackgroundSet();
				add(button36);
				JButton button37 = new JButton("Ko");
				button37.setBounds(250, 350, 50, 50);
				button37.isBackgroundSet();
				add(button37);
				
				JLabel etykieta12 = new JLabel();
				etykieta12.setFont(czcionka);
				etykieta12.setText("Koñ");
				etykieta12.setBounds(450, 350, 100, 50);
				etykieta12.setForeground(Color.blue);
				add(etykieta12);
				
				JButton button38 = new JButton("Ko");
				button38.setBounds(500, 350, 50, 50);
				button38.isBackgroundSet();
				add(button38);
				JButton button39 = new JButton("Ko");
				button39.setBounds(550, 350, 50, 50);
				button39.isBackgroundSet();
				add(button39);
				JButton button40 = new JButton("Ko");
				button40.setBounds(600, 350, 50, 50);
				button40.isBackgroundSet();
				add(button40);
				JButton button41 = new JButton("Ko");
				button41.setBounds(650, 350, 50, 50);
				button41.isBackgroundSet();
				add(button41);
				
				JLabel etykieta13 = new JLabel();
				etykieta13.setFont(czcionka);
				etykieta13.setText("Pies");
				etykieta13.setBounds(50, 400, 200, 50);
				etykieta13.setForeground(Color.red);		
				add(etykieta13);
				
				JButton button42 = new JButton("Ma³y");
				button42.setBounds(100, 400, 100, 50);
				button42.isBackgroundSet(); // bloean if true zmienia kolor
				add(button42);
				JButton button43 = new JButton("Du¿y");
				button43.setBounds(200, 400, 100, 50);
				button43.isBackgroundSet();
				add(button43);
				

				JLabel etykieta14 = new JLabel();
				etykieta14.setFont(czcionka);
				etykieta14.setText("Pies");
				etykieta14.setBounds(450, 400, 200, 50);
				etykieta14.setForeground(Color.blue);		
				add(etykieta14);
				
				JButton button44 = new JButton("Ma³y");
				button44.setBounds(500, 400, 100, 50);
				button44.isBackgroundSet();
				add(button44);
				JButton button45 = new JButton("Du¿y");
				button45.setBounds(600, 400, 100, 50);
				button45.isBackgroundSet();
				add(button45);
				
			
				// to jako popu ma byc if true
				JLabel etykieta15 = new JLabel();
				etykieta15.setFont(czcionka);
				etykieta15.setText("Spotka³eœ Lisa - tracisz króliki ");
				etykieta15.setBounds(50, 500, 200, 50);
				etykieta15.setForeground(Color.red);		
				add(etykieta15);
				
				JLabel etykieta16 = new JLabel();
				etykieta16.setFont(czcionka);
				etykieta16.setText("Spotka³eœ Lisa - tracisz króliki ");
				etykieta16.setBounds(450, 500, 200, 50);
				etykieta16.setForeground(Color.red);		
				add(etykieta16);
				
				JLabel etykieta17 = new JLabel();
				etykieta17.setFont(czcionka);
				etykieta17.setText("Spotka³eœ Wilka - tracisz wszystkie zwierzêta ");
				etykieta17.setBounds(50, 600, 400, 50);
				etykieta17.setForeground(Color.red);		
				add(etykieta17);
				
				JLabel etykieta18 = new JLabel();
				etykieta18.setFont(czcionka);
				etykieta18.setText("Spotka³eœ Wilka - tracisz wszystkie zwierzêta ");
				etykieta18.setBounds(450, 600, 400, 50);
				etykieta18.setForeground(Color.red);		
				add(etykieta18);
				
				
				
				
				
				
				JButton button = new JButton("Rzut kostk¹");
				button.setBounds(150, 700, 120, 50);
				add(button);
				
				JButton button1 = new JButton("Kup zwierzaka");
				button1.setBounds(450, 700, 120, 50);
				add(button1);
				
				
			}
		}

