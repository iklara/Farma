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
        return new Dimension(1500, 900);
    }

    Buy b;
    Sell s;
    Dice d = new Dice();
    Dice d1= new Dice();
    AnimalLabel animalLabel;
    EAnimals[] animalsList = EAnimals.values();
    public static ArrayList<ArrayList<AnimalLabel>> herd = new ArrayList<>();
    public static ArrayList<AnimalLabel> rabbitsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> pigsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> sheepsRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> cowRow = new ArrayList<>();
    public static ArrayList<AnimalLabel> horseRow = new ArrayList<>();
    
    AnimalLabel animalLabel1;
    EAnimals[] animalsList1 = EAnimals.values();
    public static ArrayList<ArrayList<AnimalLabel>> herd1 = new ArrayList<>();
    public static ArrayList<AnimalLabel> rabbitsRow1 = new ArrayList<>();
    public static ArrayList<AnimalLabel> pigsRow1 = new ArrayList<>();
    public static ArrayList<AnimalLabel> sheepsRow1 = new ArrayList<>();
    public static ArrayList<AnimalLabel> cowRow1 = new ArrayList<>();
    public static ArrayList<AnimalLabel> horseRow1 = new ArrayList<>();
    JButton buttonReset;
    int size = 105;
    int x = 550;
    int y = 600;
    
    JButton buttonReset1;
    int size1 = 105;
    int x1 = 1300;
    int y1 = 600;

    public PlaygroundPane() {
        b = new Buy();
        s = new Sell();
        setBackground(Color.getHSBColor(51,102,0));

        herd.add(rabbitsRow);
        herd.add(sheepsRow);
        herd.add(pigsRow);
        herd.add(cowRow);
        herd.add(horseRow);
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
        
        buttonReset1 = new JButton("RESET");
        buttonReset1.setBounds(1040, 50, 100, 50);
        buttonReset1.addActionListener(e -> {
            for (ArrayList<AnimalLabel> animalList : herd) {

                for (AnimalLabel animalLabel11 : animalList) {
                    animalLabel1.setFree(true);
                    animalLabel1.getLabel().setIcon(EAnimals.getWaterBear());
                    System.out.println(animalsList.length + " wiersz ");
                }
            }
        });
        add(buttonReset1);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                animalLabel1 = new AnimalLabel();
                animalLabel1.getLabel().setBounds(x1 - (j * (size1 + 10) - i * 50), y1 - (i * size), size, size);
                add(animalLabel1.getLabel());
                switch (i) {
                    case 0:
                        rabbitsRow.add(animalLabel1);
                        break;
                    case 1:
                        sheepsRow.add(animalLabel1);

                        break;
                    case 2:
                        pigsRow.add(animalLabel1);

                        break;
                    case 3:
                        cowRow.add(animalLabel1);

                        break;
                    case 4:
                        horseRow.add(animalLabel1);
                        break;
                }

            }
        }
        d1.throwDice(this, herd);
    }
}

