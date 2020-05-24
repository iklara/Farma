package playground.functions;

import playground.AnimalLabel2;
import playground.EAnimals;

import javax.swing.*;
import java.util.ArrayList;

public class Sell2 extends JPanel {

    AnimalLabel2 animalLabel2;
    public JButton buttonSell2;
    String[] animalNames = new String[]{" królika", " owcę", " świnkę", " krowę", " konia"};
    EAnimals[] animalsList = EAnimals.values();
    JButton[] sellButtonArray2;
    Buy2 b2;

    public Sell2() {
    }

    public void sell2(JPanel pane2, ArrayList<ArrayList<AnimalLabel2>> herd2) {
        b2= new Buy2();
        sellButtonArray2 = new JButton[herd2.size()];
        for (ArrayList<AnimalLabel2> hl2 : herd2) {
            for (AnimalLabel2 al2 : hl2) {
                if (herd2.get(herd2.indexOf(hl2)).get(0).isFree2() == false && herd2.indexOf(hl2) != 0) {
                    pane2.add(buttonSell2 = new JButton("Sprzedaj" + animalNames[herd2.indexOf(hl2)]));
                    buttonSell2.setName(String.valueOf(herd2.indexOf(hl2)));
                    buttonSell2.setBounds(120 + hl2.get(0).getLabel().getX(), 50 + al2.getLabel().getY(), 150, 40);
                    sellButtonArray2[herd2.indexOf(hl2)] = buttonSell2;
                    buttonSell2.addActionListener(aciton -> {
                        if (herd2.get(herd2.indexOf(hl2) - 1).get(0).isFree2() == true && herd2.get(herd2.indexOf(hl2)).get(0).isFree2() == false) {
                            for (AnimalLabel2 animal2 : herd2.get(herd2.indexOf(hl2) - 1)) {
                                switch (herd2.indexOf(hl2) - 1) {
                                    case 0:
                                        animal2.getLabel().setIcon(animalsList[6].getIconSize());
                                        animal2.setFree(false);
                                        break;
                                    case 1:
                                        animal2.getLabel().setIcon(animalsList[5].getIconSize());
                                        animal2.setFree(false);
                                        break;
                                    case 2:
                                        animal2.getLabel().setIcon(animalsList[4].getIconSize());
                                        animal2.setFree(false);
                                        break;
                                    case 3:
                                        animal2.getLabel().setIcon(animalsList[3].getIconSize());
                                        animal2.setFree(false);
                                        break;
                                    case 4:
                                        animal2.getLabel().setIcon(animalsList[2].getIconSize());
                                        animal2.setFree(false);
                                        break;
                                }
                            }
                            for (int i = hl2.size() - 1; i >= 0; i--) {
                                if (hl2.get(i).isFree2() == false) {
                                    hl2.get(i).getLabel().setIcon(EAnimals.getWaterBear());
                                    hl2.get(i).setFree(true);
                                    break;
                                }
                            }
                        } else if (herd2.get(herd2.indexOf(hl2)).get(0).isFree2() == true) {
                            JOptionPane.showMessageDialog(this, "nie masz co sprzedać");
                            buttonSell2.setVisible(false);
                        } else if (herd2.get(herd2.indexOf(hl2) - 1).get(0).isFree2() == false) {
                            JOptionPane.showMessageDialog(this, "nie masz miejsca w zagrodzie");
                            buttonSell2.setVisible(false);
                        }
                        b2.buy2(pane2,herd2);
                        sell2(pane2,herd2);
                    });
                }
            }
        }

    }
}
