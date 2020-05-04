package playground.functions;

import playground.AnimalLabel;
import playground.EAnimals;

import javax.swing.*;
import java.util.ArrayList;

import static playground.PlaygroundPane.*;

public class Dice extends JPanel {
  Buy b;
  Sell s;
    JButton buttonThrowDice;
    JLabel labelFirstDice;
    JLabel labelSecondDice;
    int animalDice1;
    int animalDice2;
    EAnimals[] animalsList = EAnimals.values();

    public Dice() {
    }

    public void throwDice(JPanel pane, ArrayList<ArrayList<AnimalLabel>> herd) {
        buttonThrowDice = new JButton();
        buttonThrowDice.setText("Throw Dice");
        buttonThrowDice.setBounds(50, 600, 100, 100);
        buttonThrowDice.setIcon(EAnimals.getDiceIcon());

        pane.add(buttonThrowDice);

        labelFirstDice = new JLabel();

        labelSecondDice = new JLabel();
        labelFirstDice.setBounds(160, 600, 100, 100);
        labelSecondDice.setBounds(270, 600, 100, 100);

        buttonThrowDice.addActionListener(action ->
        {
            b = new Buy();
            s = new Sell();
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
                }
            }
            b.buy(pane, herd);
            s.sell(pane, herd);

        });

        pane.add(labelFirstDice);
        pane.add(labelSecondDice);
    }
}