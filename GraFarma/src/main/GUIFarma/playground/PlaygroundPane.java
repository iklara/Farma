package playground;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PlaygroundPane extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);

    }

    EAnimals[] animalsList = EAnimals.values();
    Random r = new Random();
    int animalDice1;
    int animalDice2;
    JButton buttonAnimals;
    JButton buttonThrowDice;
    JButton buttonThrowDice2;
    ButtonGroup buttonGroup;
    JLabel labelFirstDice;
    JLabel labelSecondDice;
    int size = 100;
    int x = 50;
    int y = 50;
    int row = 5;
    int buttonLocation = 0;

    public PlaygroundPane() {
        System.out.println(animalsList.length);
        setLayout(null);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                buttonAnimals = new JButton();
                buttonAnimals.setBounds(x + (j * size - i * 50), y + (i * size), size, size);
                buttonAnimals.setText(String.valueOf(buttonLocation++));
                buttonAnimals.setIcon(EAnimals.BIGDOG.getIconSize());
                add(buttonAnimals);
            }
        }


        buttonThrowDice = new JButton();
        buttonThrowDice2 = new JButton();

        buttonThrowDice.setText("Throw Dice");
        buttonThrowDice2.setText("kasasd");
        buttonThrowDice.setBounds(500, 600, 100, 100);
        buttonThrowDice2.setBounds(600, 600, 100, 100);

        buttonThrowDice.addActionListener(action -> {
            animalDice1 = new Random().nextInt(8);
            animalDice2 = new Random().nextInt(8) + 1;

            buttonThrowDice.setIcon(animalsList[animalDice1].getIconSize());
            buttonThrowDice2.setIcon(animalsList[animalDice2].getIconSize());
            System.out.println(animalDice1 + " " + animalDice2 +" " + animalsList[animalDice2]);
        });


        buttonGroup = new ButtonGroup();
        buttonGroup.add(buttonThrowDice);
        buttonGroup.add(buttonThrowDice2);
        add(buttonThrowDice);
        add(buttonThrowDice2);
    }


}

