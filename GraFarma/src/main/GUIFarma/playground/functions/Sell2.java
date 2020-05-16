package playground.functions;

import playground.AnimalLabel;
import playground.EAnimals;

import javax.swing.*;
import java.util.ArrayList;

public class Sell2 extends JPanel {

    AnimalLabel animalLabel;
    public JButton buttonSell2;
    String[] animalNames = new String[]{" królika", " owcę", " świnkę", " krowę", " konia"};
    EAnimals[] animalsList = EAnimals.values();
    JButton[] sellButtonArray2;
    Buy b2;

    public Sell2() {
    }

    public void sell2(JPanel pane2, ArrayList<ArrayList<AnimalLabel>> herd2) {
        b2= new Buy();
        sellButtonArray2 = new JButton[herd2.size()];
        for (ArrayList<AnimalLabel> hl2 : herd2) {
            for (AnimalLabel al2 : hl2) {
                if (herd2.get(herd2.indexOf(hl2)).get(0).isFree() == false && herd2.indexOf(hl2) != 0) {
                    pane2.add(buttonSell2 = new JButton("Sprzedaj" + animalNames[herd2.indexOf(hl2)]));
                    buttonSell2.setName(String.valueOf(herd2.indexOf(hl2)));
                    buttonSell2.setBounds(120 + hl2.get(0).getLabel().getX(), 50 + al2.getLabel().getY(), 150, 40);
                    sellButtonArray2[herd2.indexOf(hl2)] = buttonSell2;
                    buttonSell2.addActionListener(aciton -> {
                        if (herd2.get(herd2.indexOf(hl2) - 1).get(0).isFree() == true && herd2.get(herd2.indexOf(hl2)).get(0).isFree() == false) {
                            for (AnimalLabel animal : herd2.get(herd2.indexOf(hl2) - 1)) {
                                switch (herd2.indexOf(hl2) - 1) {
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
                            for (int i = hl2.size() - 1; i >= 0; i--) {
                                if (hl2.get(i).isFree() == false) {
                                    hl2.get(i).getLabel().setIcon(EAnimals.getWaterBear());
                                    hl2.get(i).setFree(true);
                                    break;
                                }
                            }
                        } else if (herd2.get(herd2.indexOf(hl2)).get(0).isFree() == true) {
                            JOptionPane.showMessageDialog(this, "nie masz co sprzedać");
                            buttonSell2.setVisible(false);
                        } else if (herd2.get(herd2.indexOf(hl2) - 1).get(0).isFree() == false) {
                            JOptionPane.showMessageDialog(this, "nie masz miejsca w zagrodzie");
                            buttonSell2.setVisible(false);
                        }
                        b2.buy(pane2,herd2);
                        sell2(pane2,herd2);
                    });
                }
            }
        }

    }
}
