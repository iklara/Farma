package playground.functions;

import playground.AnimalLabel;
import playground.EAnimals;

import javax.swing.*;
import java.util.ArrayList;

import static playground.PlaygroundPane.*;

public class Buy2 extends JPanel {

    AnimalLabel animalLabel;
    JButton buttonBuy2;
    String[] animalNames = new String[]{" królika", " owcę", " świnkę", " krowę", " konia"};
    EAnimals[] animalsList = EAnimals.values();
    JButton[] buyButtonArray;
    Sell s2;

    public Buy2() {
    }

    public void buy2(JPanel pane2, ArrayList<ArrayList<AnimalLabel>> herd2) {
        s2 = new Sell();
        buyButtonArray = new JButton[herd2.size()];
        for (ArrayList<AnimalLabel> hl2 : herd2) {
            int buyCounter = 0;
            for (AnimalLabel al2 : hl2) {
                if (al2.isFree() == false) {
                    buyCounter++;
                }
                if (buyCounter == hl2.size() && herd2.size() > herd2.indexOf(hl2) + 1) {
                    pane2.add(buttonBuy2 = new JButton("Kup" + animalNames[herd2.indexOf(hl2) + 1]));
                    buttonBuy2.setName(String.valueOf(herd2.indexOf(hl2)));
                    buttonBuy2.setBounds(120 + hl2.get(0).getLabel().getX(), al2.getLabel().getY(), 150, 40);
                    buyButtonArray[herd2.indexOf(hl2)] = buttonBuy2;

                    buttonBuy2.addActionListener(action -> {

                        if (hl2.get(hl2.size() - 1).isFree() == false && herd2.get(herd2.indexOf(hl2) + 1).get(herd2.get(herd2.indexOf(hl2) + 1).size() - 1).isFree() == true) {
                            switch (herd2.indexOf(hl2) + 1) {
                                case 1:
                                    for (int i = 0; i < sheepsRow2.size(); i++) {
                                        System.out.println("Owca");
                                        if (sheepsRow2.get(i).isFree() == true) {
                                            sheepsRow2.get(i).getLabel().setIcon(animalsList[5].getIconSize());
                                            sheepsRow2.get(i).setFree(false);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Swinka");
                                    for (int i = 0; i < pigsRow2.size(); i++) {
                                        if (pigsRow2.get(i).isFree() == true) {
                                            pigsRow2.get(i).getLabel().setIcon(animalsList[4].getIconSize());
                                            pigsRow2.get(i).setFree(false);
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Krowa");
                                    for (int i = 0; i < cowRow2.size(); i++) {
                                        if (cowRow2.get(i).isFree() == true) {
                                            cowRow2.get(i).getLabel().setIcon(animalsList[3].getIconSize());
                                            cowRow2.get(i).setFree(false);
                                            break;
                                        }
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < horseRow2.size(); i++) {
                                        if (horseRow2.get(i).isFree() == true) {
                                            horseRow2.get(i).getLabel().setIcon(animalsList[2].getIconSize());
                                            horseRow2.get(i).setFree(false);
                                            break;
                                        }

                                    }
                                    break;
                            }
                            for (int i = hl2.size() - 1; i >= 0; i--) {
                                hl2.get(i).setFree(true);
                                hl2.get(i).getLabel().setIcon(EAnimals.getWaterBear());
                            }
                        } else if (herd2.get(herd2.indexOf(hl2) + 1).get(herd2.get(herd2.indexOf(hl2) + 1).size() - 1).isFree() == false) {
                            JOptionPane.showMessageDialog(this, "chcesz kupić a nie masz miejsca dla swojego zwierzaka");
                        } else if (hl2.get(hl2.size() - 1).isFree() == true) {
                            JOptionPane.showMessageDialog(this, "za mało zwierzątek do handlu");
                        }
                        s2.sell(pane2, herd2);
                        buy2(pane2, herd2);
                    });
                }
            }
        }
    }
}




