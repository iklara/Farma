//package GUIFarma;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JRadioButton;
//import javax.swing.JScrollPane;
//import javax.swing.JTextField;
//
//public class MyJPanel extends JPanel {
//
//	JTextField text;
//	JPasswordField text2;
//
//	@Override
//	public Dimension getPreferredSize() {
//		return new Dimension(800, 800);
//	}
//
//
//
//	class MojaAkcja implements ActionListener {
//
//		public void actionPerformed(ActionEvent e) {
//			add(new MyJPanel2());
//
//		}
//
//	}
//
//		class MojaDelete implements ActionListener {
//
//			public void actionPerformed(ActionEvent e) {
//
//			}
//	}
//
//	public MyJPanel() {
//
//		Font czcionka = new Font("Calabri", Font.BOLD, 12);
//		Font czcionkaLogo = new Font("Calabri",Font.BOLD, 52);
//
//		setLayout(null);
//
//		JLabel etykieta = new JLabel();
//		etykieta.setFont(czcionkaLogo);
//		etykieta.setText("Witaj na Farmie");
//		etykieta.setBounds(50, 100, 500, 100);
//		etykieta.setForeground(Color.red);
//
//		add(etykieta);
//
//
//		JLabel etykieta1 = new JLabel();
//		etykieta1.setFont(czcionka);
//		etykieta1.setText("Gracz 1 - podaj imie:");
//		etykieta1.setBounds(50, 250, 200, 50);
//		etykieta1.setForeground(Color.blue);
//
//		add(etykieta1);
//
//		text = new JTextField();
//		text.setBounds(250, 250, 200, 50);
//
//		add(text);
//
//		JLabel etykieta2 = new JLabel();
//		etykieta2.setFont(czcionka);
//		etykieta2.setText("Gracz 2 - podaj imie: ");
//		etykieta2.setBounds(50, 350, 200, 50);
//		etykieta2.setForeground(Color.blue);
//
//		add(etykieta2);
//
//		text2 = new JPasswordField();
//		text2.setBounds(250, 350, 200, 50);
//
//
//		add(text2);
//
//		JLabel etykieta3 = new JLabel();
//		etykieta3.setFont(czcionka);
//		etykieta3.setText("Wchodzisz na w�asn� odpowiedzialno��");
//		etykieta3.setBounds(250, 450, 300, 50);
//		etykieta3.setForeground(Color.BLACK);
//
//		add(etykieta3);
//
//		JButton button = new JButton("Rezygnuje");
//		button.setBounds(150, 550, 120, 50);
//		button.addActionListener(new MojaDelete());
//		add(button);
//
//		JButton button1 = new JButton("Gram");
//		button1.setBounds(500, 550, 120, 50);
//		button1.addActionListener(new MojaAkcja());
//		add(button1);
//
//	}
//
//}
