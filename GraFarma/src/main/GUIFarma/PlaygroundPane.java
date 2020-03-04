import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PlaygroundPane extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);
    }

    Random r = new Random();
    String animalDice1;
    String animalDice2;
    JButton buttonAnimals;
    JButton buttonThrowDice;
    JLabel labelFirstDice;
    JLabel labelSecondDice;
    int size = 100;
    int x = 50;
    int y = 50;
    int row = 5;
    int buttonLocation = 0;

    public PlaygroundPane() {

        setLayout(null);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                buttonAnimals = new JButton();
                buttonAnimals.setBounds(x + (j * size - i * 50), y + (i * size), size, size);
                buttonAnimals.setText(String.valueOf(buttonLocation++));
                add(buttonAnimals);
            }
        }

        buttonThrowDice = new JButton();
        buttonThrowDice.setText("Throw Dice");
        buttonThrowDice.setBounds(500, 600, 200, 100);
        buttonThrowDice.addActionListener(action -> {
            animalDice1 = String.valueOf(new Random().nextInt(5) + 1);
            animalDice2 = String.valueOf(new Random().nextInt(5) + 1);
            buttonThrowDice.setText(animalDice1 + " | " + animalDice2);
        });
        add(buttonThrowDice);

    }


}

