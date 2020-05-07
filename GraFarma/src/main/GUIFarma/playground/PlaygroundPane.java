package playground;

import playground.functions.Buy;
import playground.functions.Dice;
import playground.functions.Sell;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PlaygroundPane extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);
    }

    Buy b;
    Sell s;
    Dice d;
    AnimalLabel animalLabel;
    EAnimals[] animalsList = EAnimals.values();
    public static ArrayList<ArrayList<AnimalLabel>> herd = new ArrayList<>();
    public static ArrayList<AnimalLabel> rabbitsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> pigsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> sheepsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> cowRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> horseRow = new ArrayList<>();
    JButton buttonReset;
    int size = 105;
    int x = 480;
    int y = 480;

    public PlaygroundPane() {
        b = new Buy();
        s = new Sell();
        d = new Dice();
        herd.add(rabbitsRow);
        herd.add(sheepsRow);
        herd.add(pigsRow);
        herd.add(cowRow);
        herd.add(horseRow);
        setLayout(null);
        buttonReset = new JButton("RESET");
        buttonReset.setBounds(300, 10, 50, 50);
        buttonReset.addActionListener(e -> {
            for (ArrayList<AnimalLabel> animalList : herd) {

                for (AnimalLabel animalLabel : animalList) {
                    animalLabel.setFree(true);
                    animalLabel.getLabel().setIcon(EAnimals.getWaterBear());
                    System.out.println(animalsList.length + " wiersz ");
                }
            }
        });
        add(buttonReset);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                animalLabel = new AnimalLabel();
                animalLabel.getLabel().setBounds(x - (j * (size + 10) - i * 50), y - (i * size), size, size);
                add(animalLabel.getLabel());
                switch (i) {
                    case 0:
                        rabbitsRow.add(animalLabel);
                        break;
                    case 1:
                        sheepsRow.add(animalLabel);

                        break;
                    case 2:
                        pigsRow.add(animalLabel);

                        break;
                    case 3:
                        cowRow.add(animalLabel);

                        break;
                    case 4:
                        horseRow.add(animalLabel);
                        break;
                }
            }
        }
        d.throwDice(this, herd);

    }
}

