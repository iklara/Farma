package playground;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class PlaygroundPane extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);

    }

    AnimalLabel animalLabel;
    EAnimals[] animalsList = EAnimals.values();
    Random r = new Random();
    int animalDice1;
    int animalDice2;
    JButton buttonBuy;
    JButton buttonSell;
    JButton buttonThrowDice;
    JLabel labelFirstDice;
    JLabel labelSecondDice;

    ArrayList<ArrayList> herd = new ArrayList<>();
    ArrayList<AnimalLabel> rabbitsRow = new ArrayList<>();
    ArrayList<AnimalLabel> pigsRow = new ArrayList<>();
    ArrayList<AnimalLabel> sheepsRow = new ArrayList<>();
    ArrayList<AnimalLabel> cowRow = new ArrayList<>();
    ArrayList<AnimalLabel> horseRow = new ArrayList<>();


    int size = 105;
    int x = 480;
    int y = 480;


    public PlaygroundPane() {
        herd.add(rabbitsRow);
        herd.add(sheepsRow);
        herd.add(pigsRow);
        herd.add(cowRow);
        herd.add(horseRow);

        setLayout(null);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                animalLabel = new AnimalLabel();
                animalLabel.getLabel().setBounds(x - (j * (size + 10) - i * 50), y - (i * size), size, size);
                add(animalLabel.getLabel());
                switch (i) {
                    case 0:
                        rabbitsRow.add(animalLabel);

                        break;
                    case 1:
                        sheepsRow.add(animalLabel);

                        break;
                    case 2:
                        pigsRow.add(animalLabel);

                        break;
                    case 3:
                        cowRow.add(animalLabel);

                        break;
                    case 4:
                        horseRow.add(animalLabel);
                        break;
                }
            }
        }


        buttonThrowDice = new JButton();
        buttonThrowDice.setText("Throw Dice");
        buttonThrowDice.setBounds(50, 600, 100, 100);
        buttonThrowDice.setIcon(EAnimals.getDiceIcon());
        add(buttonThrowDice);

        labelFirstDice = new JLabel();
        labelSecondDice = new JLabel();
        labelFirstDice.setBounds(160, 600, 100, 100);
        labelSecondDice.setBounds(270, 600, 100, 100);

        buttonThrowDice.addActionListener(action -> {

            for (ArrayList<AnimalLabel> a : herd) {
                buy(a);
            }
            buy(rabbitsRow);
            buy(sheepsRow);
            buy(pigsRow);
            buy(cowRow);
            buy(horseRow);

            animalDice1 = 4;
            animalDice2 = 4;
//            animalDice1 = new Random().nextInt(8);
//            animalDice2 = new Random().nextInt(8) + 1;

            labelFirstDice.setIcon(animalsList[animalDice1].getIconSize());
            labelSecondDice.setIcon(animalsList[animalDice2].getIconSize());
            if (animalDice1 == animalDice2) {
                switch (animalDice1) {
                    case 2:
                        horseRow.get(0).getLabel().setIcon(animalsList[animalDice1].getIconSize());
                        break;
                    case 3:
                        for (AnimalLabel a : cowRow) {
                            if (a.isFree) {
                                a.getLabel().setIcon(animalsList[animalDice1].getIconSize());
                                a.setFree(false);
                                break;
                            }
                        }
                        break;

                    case 4:
                        for (AnimalLabel a : pigsRow) {
                            if (a.isFree) {
                                a.getLabel().setIcon(animalsList[animalDice1].getIconSize());
                                a.setFree(false);
                                break;
                            }
                        }
                        break;

                    case 5:
                        for (AnimalLabel a : sheepsRow) {
                            if (a.isFree) {
                                a.getLabel().setIcon(animalsList[animalDice1].getIconSize());
                                a.setFree(false);
                                break;
                            }
                        }
                        break;
                    case 6:
                        for (AnimalLabel a : rabbitsRow) {
                            if (a.isFree) {
                                a.getLabel().setIcon(animalsList[animalDice1].getIconSize());
                                a.setFree(false);
                                break;
                            }
                        }
                        break;
                }


            }

        });

        add(labelFirstDice);
        add(labelSecondDice);

    }

    public void buy(ArrayList<AnimalLabel> arrayList) {
        JButton buttonBuy = new JButton();
        buttonBuy.setText("Kup");
        int counter = 0;
        for (AnimalLabel a : arrayList) {
            if (a.isFree() == false) {
                counter++;
            }
            if (counter == arrayList.size()) {
                add(buttonBuy);
                buttonBuy.setBounds(120 + arrayList.get(0).getLabel().getX(), a.getLabel().getY(), 100, 50);
                System.out.println("bene");
            }
            System.out.println(counter);
        }

    }

    public void sell(ArrayList<AnimalLabel>arrayList){
        JButton buttonSell = new JButton();

    }
}


