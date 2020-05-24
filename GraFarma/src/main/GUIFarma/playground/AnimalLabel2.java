package playground;

import playground.EAnimals;

import javax.swing.*;

public class AnimalLabel2 extends JPanel {

    JLabel label2;
    boolean isFree2;
    String name2;
    Boolean Played2;

    public AnimalLabel2() {
        label2 = new JLabel();
        label2.setIcon(EAnimals.getWaterBear());
        isFree2 = true;


    }

    public JLabel getLabel() {
        return label2;
    }

    public void setLabel(JLabel label2) {
        this.label2 = label2;
    }

    public boolean isFree2() {
        return isFree2;
    }

    public void setFree(boolean free2) {
        isFree2 = free2;
    }

    @Override
    public String getName() {
        return name2;
    }

    @Override
    public void setName(String name) {
        this.name2 = name;
    }

    @Override
    public String toString() {
        return "AnimalLabel2{" +
                "isFree2=" + isFree2 +
                '}';
    }
}
