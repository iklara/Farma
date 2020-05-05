package playground.functions;

import playground.AnimalLabel;
import playground.EAnimals;
import playground.PlaygroundPane;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static playground.PlaygroundPane.*;

public class Buy extends JPanel {

    AnimalLabel animalLabel;
    JButton buttonBuy;
    String[] animalNames = new String[]{" królika", " owcę", " świnkę", " krowę", " konia"};
    EAnimals[] animalsList = EAnimals.values();
    JButton[] buyButtonArray;
    Sell s;

    public Buy() {
    }

    public void buy(JPanel pane, ArrayList<ArrayList<AnimalLabel>> herd) {
        s = new Sell();
        buyButtonArray = new JButton[herd.size()];
        for (ArrayList<AnimalLabel> hl : herd) {
            int buyCounter = 0;
            for (AnimalLabel al : hl) {
                if (al.isFree() == false) {
                    buyCounter++;
                }
                if (buyCounter == hl.size() && herd.size() > herd.indexOf(hl) + 1) {
                    pane.add(buttonBuy = new JButton("Kup" + animalNames[herd.indexOf(hl) + 1]));
                    buttonBuy.setName(String.valueOf(herd.indexOf(hl)));
                    buttonBuy.setBounds(120 + hl.get(0).getLabel().getX(), al.getLabel().getY(), 150, 40);
                    buyButtonArray[herd.indexOf(hl)] = buttonBuy;

                    buttonBuy.addActionListener(action -> {

                        if (hl.get(hl.size() - 1).isFree() == false && herd.get(herd.indexOf(hl) + 1).get(herd.get(herd.indexOf(hl) + 1).size() - 1).isFree() == true) {
                            switch (herd.indexOf(hl) + 1) {
                                case 1:
                                    for (int i = 0; i < sheepsRow.size(); i++) {
                                        if (sheepsRow.get(i).isFree() == true) {
                                            sheepsRow.get(i).getLabel().setIcon(animalsList[5].getIconSize());
                                            sheepsRow.get(i).setFree(false);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Swinka");
                                    for (int i = 0; i < pigsRow.size(); i++) {
                                        if (pigsRow.get(i).isFree() == true) {
                                            pigsRow.get(i).getLabel().setIcon(animalsList[4].getIconSize());
                                            pigsRow.get(i).setFree(false);
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Krowa");
                                    for (int i = 0; i < cowRow.size(); i++) {
                                        if (cowRow.get(i).isFree() == true) {
                                            cowRow.get(i).getLabel().setIcon(animalsList[3].getIconSize());
                                            cowRow.get(i).setFree(false);
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < horseRow.size(); i++) {
                                        if (horseRow.get(i).isFree() == true) {
                                            horseRow.get(i).getLabel().setIcon(animalsList[2].getIconSize());
                                            horseRow.get(i).setFree(false);
                                            break;
                                        }

                                    }
                                    break;
                            }
                            for (int i = hl.size() - 1; i >= 0; i--) {
                                hl.get(i).setFree(true);
                                hl.get(i).getLabel().setIcon(EAnimals.getWaterBear());
                            }
                        } else if (herd.get(herd.indexOf(hl) + 1).get(herd.get(herd.indexOf(hl) + 1).size() - 1).isFree() == false) {
                            JOptionPane.showMessageDialog(this, "chcesz kupić a nie masz miejsca dla swojego zwierzaka");
                        } else if (hl.get(hl.size() - 1).isFree() == true) {
                            JOptionPane.showMessageDialog(this, "za mało zwierzątek do handlu");
                        }
                        s.sell(pane, herd);
                        buy(pane, herd);

                    });
                    ;
                }
            }
        }
    }
}




