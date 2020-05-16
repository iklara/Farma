package playground;

import playground.functions.Buy;
import playground.functions.Dice;
import playground.functions.Dice2;
import playground.functions.Sell;
import playground.functions.Sell2;
import playground.functions.Buy2;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PlaygroundPane extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1500, 900);
    }

    Buy b;
    Sell s;
    Buy2 b2;
    Sell2 s2;
    Dice d = new Dice();
    Dice2 d2 = new Dice2();

    Boolean Gracz1 = false;
    Boolean Gracz2 = false;


    AnimalLabel animalLabel;
    EAnimals[] animalsList = EAnimals.values();

    public static ArrayList<ArrayList<AnimalLabel>> herd = new ArrayList<>();
    public static ArrayList<AnimalLabel> rabbitsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> pigsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> sheepsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> cowRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> horseRow = new ArrayList<>();

    AnimalLabel animalLabel2;

    public static ArrayList<ArrayList<AnimalLabel>> herd2 = new ArrayList<>();
    public static ArrayList<AnimalLabel> rabbitsRow2 = new ArrayList<>();
    public static ArrayList<AnimalLabel> pigsRow2 = new ArrayList<>();
    public static ArrayList<AnimalLabel> sheepsRow2 = new ArrayList<>();
    public static ArrayList<AnimalLabel> cowRow2 = new ArrayList<>();
    public static ArrayList<AnimalLabel> horseRow2 = new ArrayList<>();
    JButton buttonReset;
    int size = 105;
    int x = 550;
    int y = 600;

    JButton buttonReset2;
    int size1 = 105;
    int x1 = 1300;
    int y1 = 600;

    public PlaygroundPane() {
        b = new Buy();
        s = new Sell();
        b2 = new Buy2();
        s2 = new Sell2();

        setBackground(Color.white);


        herd.add(rabbitsRow);
        herd.add(sheepsRow);
        herd.add(pigsRow);
        herd.add(cowRow);
        herd.add(horseRow);

        herd2.add(rabbitsRow2);
        herd2.add(sheepsRow2);
        herd2.add(pigsRow2);
        herd2.add(cowRow2);
        herd2.add(horseRow2);

        setLayout(null);
        buttonReset = new JButton("RESET");
        buttonReset.setBounds(300, 50, 100, 50);
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

        buttonReset2 = new JButton("RESET");
        buttonReset2.setBounds(1040, 50, 100, 50);
        buttonReset2.addActionListener(e -> {
            for (ArrayList<AnimalLabel> animalList2 : herd2) {

                for (AnimalLabel animalLabel : animalList2) {
                    animalLabel.setFree(true);
                    animalLabel.getLabel().setIcon(EAnimals.getWaterBear());
                    System.out.println(animalsList.length + " wiersz ");
                }
            }
        });
        add(buttonReset2);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                animalLabel2 = new AnimalLabel();
                animalLabel2.getLabel().setBounds(x1 - (j * (size1 + 10) - i * 50), y1 - (i * size), size, size);
                add(animalLabel2.getLabel());
                switch (i) {
                    case 0:
                        rabbitsRow2.add(animalLabel2);
                        break;
                    case 1:
                        sheepsRow2.add(animalLabel2);

                        break;
                    case 2:
                        pigsRow2.add(animalLabel2);

                        break;
                    case 3:
                        cowRow2.add(animalLabel2);

                        break;
                    case 4:
                        horseRow2.add(animalLabel2);
                        break;
                }

            }
        }
        d2.throwDice2(this, herd2);


    }
}