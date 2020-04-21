package playground;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
    JLabel label;
    JButton buttonThrowDice;
    JLabel labelFirstDice;
    JLabel labelSecondDice;

    ArrayList<JLabel> rabbitsRow = new ArrayList<>();
    ArrayList<JLabel> pigsRow = new ArrayList<>();
    ArrayList<JLabel> sheepsRow = new ArrayList<>();
    ArrayList<JLabel> cowRow = new ArrayList<>();
    ArrayList<JLabel> horseRow = new ArrayList<>();

    int size = 105;
    int x = 480;
    int y = 480;


    public PlaygroundPane() {
        System.out.println(animalsList.length);
        setLayout(null);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                label = new JLabel();
                label.setBounds(x - (j * (size + 10) - i * 50), y - (i * size), size, size);
                label.setIcon(EAnimals.getWaterBear());
                add(label);

                switch (i) {
                    case 0:
                        rabbitsRow.add(label);
                        break;
                    case 1:
                        sheepsRow.add(label);
                        break;
                    case 2:
                        pigsRow.add(label);
                        break;
                    case 3:
                        cowRow.add(label);
                        break;
                    case 4:
                        horseRow.add(label);
                        break;
                }
            }
        }

        buttonThrowDice = new JButton();
        buttonThrowDice.setText("Throw Dice");
        buttonThrowDice.setBounds(555, 190, 100, 100);
        buttonThrowDice.setIcon(EAnimals.getDiceIcon());
        add(buttonThrowDice);

        labelFirstDice = new JLabel();
        labelSecondDice = new JLabel();
        labelFirstDice.setBounds(500, 300, 100, 100);
        labelSecondDice.setBounds(610, 300, 100, 100);

        buttonThrowDice.addActionListener(action -> {
            animalDice1 = new Random().nextInt(8);
            animalDice2 = new Random().nextInt(8) + 1;
            labelFirstDice.setIcon(animalsList[animalDice1].getIconSize());
            labelSecondDice.setIcon(animalsList[animalDice2].getIconSize());
            if (animalDice1 == animalDice2) {
                switch (animalDice1) {
                    case 2:
//                        if (horseRow.get(0).getIcon().equals(EAnimals.getWaterBear().getImage()) ) {
//                            horseRow.get(0).setIcon(animalsList[animalDice1].getIconSize());
//                        } else JOptionPane.showMessageDialog(this, "Nie ma co dodawać");

                        horseRow.get(0).setIcon(animalsList[animalDice1].getIconSize());
                        break;

                    case 3:
//                        if (cowRow.size() > 2 && cowRow.get(0).getIcon().equals(EAnimals.getWaterBear())) {
//                            cowRow.get(cowRow.size() + 1).setIcon(animalsList[animalDice1].getIconSize());
//                        } else JOptionPane.showMessageDialog(this, "Nie ma co dodawać");

                        cowRow.get(0).setIcon(animalsList[animalDice1].getIconSize());
                        break;

                    case 4:
//                        if (pigsRow.get(0).getIcon().equals(EAnimals.getWaterBear())) {
//                            pigsRow.get(pigsRow.size() + 1).setIcon(animalsList[animalDice1].getIconSize());
//                        } else JOptionPane.showMessageDialog(this, "Nie ma co dodawać");
                        pigsRow.get(0).setIcon(animalsList[animalDice1].getIconSize());
                        break;

                    case 5:
//                        if ( sheepsRow.get(0).getIcon().equals(EAnimals.getWaterBear())) {
//                            sheepsRow.get(sheepsRow.size() + 1).setIcon(animalsList[animalDice1].getIconSize());
//                        } else JOptionPane.showMessageDialog(this, "Nie ma co dodawać");
                        sheepsRow.get(0).setIcon(animalsList[animalDice1].getIconSize());
                        break;

                    case 6:
//                        if (rabbitsRow.get(0).getIcon().equals(EAnimals.getWaterBear())) {
//                            rabbitsRow.get(rabbitsRow.size() + 1).setIcon(animalsList[animalDice1].getIconSize());
//                        } else JOptionPane.showMessageDialog(this, "Nie ma co dodawać");
                        rabbitsRow.get(0).setIcon(animalsList[animalDice1].getIconSize());
                        break;


                }


            }

        });

        add(labelFirstDice);
        add(labelSecondDice);

    }


}

