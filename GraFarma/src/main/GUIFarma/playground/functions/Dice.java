package playground.functions;

import playground.AnimalLabel;
import playground.EAnimals;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import static playground.PlaygroundPane.*;

public class Dice extends JPanel {

    AnimalLabel smallDog = new AnimalLabel();
    AnimalLabel bigDog = new AnimalLabel();
    Buy b = new Buy();
    Sell s = new Sell();


    JButton buttonThrowDice = new JButton();
    JButton buttonDice1 = new JButton("Dodaj");
    JButton buttonDice2 = new JButton("Dodaj");
    JLabel labelFirstDice = new JLabel();
    JLabel labelSecondDice = new JLabel();

    JLabel labelBigDog = new JLabel();
    JLabel labelSmallDog = new JLabel();

    int animalDice1;
    int animalDice2;
    EAnimals[] animalsList = EAnimals.values();

    public Dice() {
    }

    public void throwDice(JPanel pane, ArrayList<ArrayList<AnimalLabel>> herd) {

        labelBigDog.setIcon(EAnimals.BIGDOG.getIconSize());
        labelBigDog.setBounds(380, 600, 100, 100);


        labelSmallDog.setIcon(EAnimals.SMALLDOG.getIconSize());
        labelSmallDog.setBounds(490, 600, 100, 100);

        if (bigDog.isFree() == false) {
            labelBigDog.setVisible(true);
        } else {
            labelBigDog.setVisible(false);
        }

        if (smallDog.isFree() == false) {
            labelSmallDog.setVisible(true);
        } else {
            labelSmallDog.setVisible(false);
        }


        labelFirstDice.setBounds(160, 600, 100, 100);
        labelSecondDice.setBounds(270, 600, 100, 100);

        buttonThrowDice.setText("Throw Dice");
        buttonThrowDice.setBounds(50, 600, 100, 100);
        buttonThrowDice.setIcon(EAnimals.getDiceIcon());

        buttonDice1.setBounds(160, 710, 100, 50);
        buttonDice1.setVisible(false);
        buttonDice1.addActionListener(e -> {
            notSameValueOnDice(pane, animalDice1);
            buttonDice1.setVisible(false);
            buttonDice2.setVisible(false);
        });


        buttonDice2.setBounds(270, 710, 100, 50);
        buttonDice2.setVisible(false);
        buttonDice2.addActionListener(e -> {
            notSameValueOnDice(pane, animalDice2);
            buttonDice1.setVisible(false);
            buttonDice2.setVisible(false);
        });


        pane.add(labelBigDog);
        pane.add(labelSmallDog);
        pane.add(buttonDice1);
        pane.add(buttonDice2);
        pane.add(buttonThrowDice);

        buttonThrowDice.addActionListener(action ->
        {
//            animalDice1 = 0;
//            animalDice2 = 8;
            animalDice1 = new Random().nextInt(8);
            animalDice2 = new Random().nextInt(8) + 1;
            labelFirstDice.setIcon(animalsList[animalDice1].getIconSize());
            labelSecondDice.setIcon(animalsList[animalDice2].getIconSize());


            if (animalDice1 == animalDice2) {
                sameValueOnDice(animalDice2);
                buttonDice1.setVisible(false);
                buttonDice2.setVisible(false);
            } else if (animalDice1 == 0 || animalDice2 == 8) {
                foxAndWolfs(animalDice1, animalDice2);
            } else {
                buttonDice1.setVisible(true);
                buttonDice2.setVisible(true);
            }

            b.buy(pane, herd);
            s.sell(pane, herd);
        });
        pane.add(labelFirstDice);
        pane.add(labelSecondDice);
    }

    public void notSameValueOnDice(JPanel pane, int animalDice1) {
        switch (animalDice1) {
            case 6:
                for (int i = 1; i < rabbitsRow.size(); i++) {
                    if (rabbitsRow.get(i).isFree() == true && rabbitsRow.get(i - 1).isFree() == false) {
                        rabbitsRow.get(i).getLabel().setIcon(animalsList[6].getIconSize());
                        rabbitsRow.get(i).setFree(false);
                        System.out.println(i);
                        break;
                    }
                }
                break;
            case 5:
                for (int i = 1; i < sheepsRow.size(); i++) {
                    if (sheepsRow.get(i).isFree() == true && sheepsRow.get(i - 1).isFree() == false) {
                        sheepsRow.get(i).getLabel().setIcon(animalsList[5].getIconSize());
                        sheepsRow.get(i).setFree(false);
                        break;
                    }
                }
                break;
            case 4:
                for (int i = 1; i < pigsRow.size(); i++) {
                    if (pigsRow.get(i).isFree() == true && pigsRow.get(i - 1).isFree() == false) {
                        pigsRow.get(i).getLabel().setIcon(animalsList[4].getIconSize());
                        pigsRow.get(i).setFree(false);
                        break;
                    }
                }
                break;
            case 3:
                for (int i = 1; i < cowRow.size(); i++) {
                    if (cowRow.get(i).isFree() == true && cowRow.get(i - 1).isFree() == false) {
                        cowRow.get(i).getLabel().setIcon(animalsList[3].getIconSize());
                        cowRow.get(i).setFree(false);
                        break;
                    }
                }
                break;
            case 2:
                for (int i = 1; i < horseRow.size(); i++) {
                    if (horseRow.get(i).isFree() == true && horseRow.get(i - 1).isFree() == false) {
                        horseRow.get(i).getLabel().setIcon(animalsList[2].getIconSize());
                        horseRow.get(i).setFree(false);
                        break;
                    }
                }
                break;
        }


    }

    public void sameValueOnDice(int animalDice1) {
        switch (animalDice1) {
            case 1:
                labelSmallDog.setIcon(animalsList[animalDice1].getIconSize());
                labelSmallDog.setVisible(true);
                smallDog.setFree(false);
            case 2:
                horseRow.get(0).getLabel().setIcon(animalsList[animalDice1].getIconSize());
                horseRow.get(0).setFree(false);
                break;
            case 3:
                for (AnimalLabel a : cowRow) {
                    if (a.isFree() == true) {
                        a.getLabel().setIcon(animalsList[animalDice1].getIconSize());
                        a.setFree(false);
                        break;
                    }
                }
                break;
            case 4:
                for (AnimalLabel a : pigsRow) {
                    if (a.isFree() == true) {
                        a.getLabel().setIcon(animalsList[animalDice1].getIconSize());
                        a.setFree(false);
                        break;
                    }
                }
                break;

            case 5:
                for (AnimalLabel a : sheepsRow) {
                    if (a.isFree() == true) {
                        a.getLabel().setIcon(animalsList[animalDice1].getIconSize());
                        a.setFree(false);
                        break;
                    }
                }
                break;
            case 6:
                for (AnimalLabel a : rabbitsRow) {
                    if (a.isFree() == true) {
                        a.getLabel().setIcon(animalsList[animalDice1].getIconSize());
                        a.setFree(false);
                        break;
                    }
                }
                break;

            case 7:
                labelBigDog.setIcon(animalsList[animalDice1].getIconSize());
                labelBigDog.setVisible(true);
                bigDog.setFree(false);
        }
    }

    public void foxAndWolfs(int animalDice1, int animalDice2) {
        if (animalDice1 == 0 && smallDog.isFree() == true) {
            for (AnimalLabel a : rabbitsRow) {
                a.getLabel().setIcon(EAnimals.getWaterBear());
                a.setFree(true);
            }
//            JOptionPane.showMessageDialog(this, "Nie masz psa więc Lis zabrał wszystkie twoje króliki Do Luster");
        } else if (animalDice1 == 0 && smallDog.isFree() == false) {
            smallDog.setFree(true);
        }


        if (animalDice2 == 8 && bigDog.isFree() == true) {
            for (AnimalLabel rabbit : rabbitsRow) {
                rabbit.getLabel().setIcon(EAnimals.getWaterBear());
                rabbit.setFree(true);
            }

            for (AnimalLabel sheep : sheepsRow) {
                sheep.getLabel().setIcon(EAnimals.getWaterBear());
                sheep.setFree(true);
            }

            for (AnimalLabel pig : pigsRow) {
                pig.getLabel().setIcon(EAnimals.getWaterBear());
                pig.setFree(true);
            }

            for (AnimalLabel cow : cowRow) {
                cow.getLabel().setIcon(EAnimals.getWaterBear());
                cow.setFree(true);
            }
        } else if (animalDice2 == 8 && bigDog.isFree() == false) {
            bigDog.setFree(false);
        }
//            JOptionPane.showMessageDialog(this, "Wilk dzięki swojej charyzmie został prezydentem galaktyki i wysłał wszystkich poza koniem do gwiazdozbioru Lutni");
    }
}


