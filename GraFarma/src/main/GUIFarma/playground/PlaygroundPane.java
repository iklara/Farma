package playground;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

//animalDice2 =3;
//animalDice1 =3;
            animalDice1 = new Random().nextInt(8);
            animalDice2 = new Random().nextInt(8) + 1;

            labelFirstDice.setIcon(animalsList[animalDice1].getIconSize());
            labelSecondDice.setIcon(animalsList[animalDice2].getIconSize());
            if (animalDice1 == animalDice2) {
                switch (animalDice1) {
                    case 2:
                        horseRow.get(0).getLabel().setIcon(animalsList[animalDice1].getIconSize());
                        horseRow.get(0).setFree(false);
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

            buys(herd);
        });

        add(labelFirstDice);
        add(labelSecondDice);

    }

    public void buys(ArrayList<ArrayList> herd) {



        JButton buttonBuy = new JButton();
        JButton buttonSell = new JButton();
        buttonSell.setText("Sprzedaj");
        buttonBuy.setText("Kup");

        for (ArrayList<AnimalLabel> hl : herd) {
            int buyCounter = 0;
            for (AnimalLabel al : hl) {

                if (al.isFree() == false) {
                    buyCounter++;
                }

                if (buyCounter == hl.size() && herd.size() > herd.indexOf(hl) + 1) {
                    add(buttonBuy);
                    buttonBuy.setBounds(120 + hl.get(0).getLabel().getX(), al.getLabel().getY(), 100, 40);
                }
//                System.out.println("inex of hl " + herd.indexOf(hl)  + " buyCounter " + buyCounter+ " " + al.isFree());
                if (al.isFree() == false) {
                    System.out.println(herd.indexOf(hl) + " " + herd.size());
                }

                if (al.isFree ==false && herd.indexOf(hl) != 0) {
                    add(buttonSell);
                    buttonSell.setBounds(120 + hl.get(0).getLabel().getX(), 50 + al.getLabel().getY(), 100, 40);

                }

            }
        }
    }
}



