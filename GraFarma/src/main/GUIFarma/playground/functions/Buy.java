package playground.functions;

import playground.AnimalLabel;
import playground.EAnimals;
import playground.PlaygroundPane;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
                        s = new Sell();
                        if (hl.get(hl.size() - 1).isFree() == false && herd.get(herd.indexOf(hl) + 1).get(herd.get(herd.indexOf(hl) + 1).size() - 1).isFree() == true) {

                            for (AnimalLabel animal : herd.get(herd.indexOf(hl) + 1)) {

                                switch (herd.indexOf(hl) + 1) {

                                    case 1:
                                        for (int i = 0; i < herd.indexOf(hl) + 1; i++) {
                                            animal.getLabel().setIcon(animalsList[5].getIconSize());
                                            animal.setFree(false);

                                        }
                                        break;
                                    case 2:
                                        for (int i = 0; i < herd.indexOf(hl) + 1; i++) {
                                            animal.getLabel().setIcon(animalsList[4].getIconSize());
                                            animal.setFree(false);
                                        }
                                        break;

                                    case 3:
                                        for (int i = 0; i < herd.indexOf(hl) + 1; i++) {
                                            animal.getLabel().setIcon(animalsList[3].getIconSize());
                                            animal.setFree(false);
                                        }
                                        break;

                                    case 4:
                                        for (int i = 0; i < herd.indexOf(hl) + 1; i++) {
                                            animal.getLabel().setIcon(animalsList[2].getIconSize());
                                            animal.setFree(false);
                                        }
                                        break;
                                }
                                for (int i = hl.size() - 1; i >= 0; i--) {
                                    hl.get(i).setFree(true);
                                    hl.get(i).getLabel().setIcon(EAnimals.getWaterBear());
                                }
                            }
                        } else if (herd.get(herd.indexOf(hl) + 1).get(herd.get(herd.indexOf(hl) + 1).size() - 1).isFree() == false) {
                            JOptionPane.showMessageDialog(this, "chcesz kupić a nie masz miejsca dla swojego zwierzaka");
                        } else if (hl.get(hl.size() - 1).isFree() == true) {
                            JOptionPane.showMessageDialog(this, "za mało zwierzątek do handlu");
                        }
                        s.sell(pane, herd);
                        buy(pane, herd);
                    });
                }
            }
        }
    }
}




