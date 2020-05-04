package playground.functions;

import playground.AnimalLabel;
import playground.EAnimals;

import javax.swing.*;
import java.util.ArrayList;

public class Sell extends JPanel {

    AnimalLabel animalLabel;
    public JButton buttonSell;
    String[] animalNames = new String[]{" królika", " owcę", " świnkę", " krowę", " konia"};
    EAnimals[] animalsList = EAnimals.values();
    JButton[] sellButtonArray;
    Buy b;

    public Sell() {
    }

    public void sell(JPanel pane, ArrayList<ArrayList<AnimalLabel>> herd) {
        b= new Buy();
        sellButtonArray = new JButton[herd.size()];
        for (ArrayList<AnimalLabel> hl : herd) {
            for (AnimalLabel al : hl) {
                if (herd.get(herd.indexOf(hl)).get(0).isFree() == false && herd.indexOf(hl) != 0) {
                    pane.add(buttonSell = new JButton("Sprzedaj" + animalNames[herd.indexOf(hl)]));
                    buttonSell.setName(String.valueOf(herd.indexOf(hl)));
                    buttonSell.setBounds(120 + hl.get(0).getLabel().getX(), 50 + al.getLabel().getY(), 150, 40);
                    sellButtonArray[herd.indexOf(hl)] = buttonSell;
                    buttonSell.addActionListener(aciton -> {
                        if (herd.get(herd.indexOf(hl) - 1).get(0).isFree() == true && herd.get(herd.indexOf(hl)).get(0).isFree() == false) {
                            for (AnimalLabel animal : herd.get(herd.indexOf(hl) - 1)) {
                                switch (herd.indexOf(hl) - 1) {
                                    case 0:
                                        animal.getLabel().setIcon(animalsList[6].getIconSize());
                                        animal.setFree(false);
                                        break;
                                    case 1:
                                        animal.getLabel().setIcon(animalsList[5].getIconSize());
                                        animal.setFree(false);
                                        break;
                                    case 2:
                                        animal.getLabel().setIcon(animalsList[4].getIconSize());
                                        animal.setFree(false);
                                        break;
                                    case 3:
                                        animal.getLabel().setIcon(animalsList[3].getIconSize());
                                        animal.setFree(false);
                                        break;
                                    case 4:
                                        animal.getLabel().setIcon(animalsList[2].getIconSize());
                                        animal.setFree(false);
                                        break;
                                }
                            }
                            for (int i = hl.size() - 1; i >= 0; i--) {
                                if (hl.get(i).isFree() == false) {
                                    hl.get(i).getLabel().setIcon(EAnimals.getWaterBear());
                                    hl.get(i).setFree(true);
                                    break;
                                }
                            }
                        } else if (herd.get(herd.indexOf(hl)).get(0).isFree() == true) {
                            JOptionPane.showMessageDialog(this, "nie masz co sprzedać");
                            buttonSell.setVisible(false);
                        } else if (herd.get(herd.indexOf(hl) - 1).get(0).isFree() == false) {
                            JOptionPane.showMessageDialog(this, "nie masz miejsca w zagrodzie");
                            buttonSell.setVisible(false);
                        }
                        b.buy(pane,herd);
                        sell(pane,herd);
                    });
                }
            }
        }

    }
}
