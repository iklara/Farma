package playground;

import javax.swing.*;

public class AnimalLabel extends JPanel {

    JLabel label;
    boolean isFree;
    String name;


    public AnimalLabel() {
        label = new JLabel();
        label.setIcon(EAnimals.getWaterBear());
        isFree = true;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnimalLabel{" +
                "isFree=" + isFree +
                '}';
    }
}
