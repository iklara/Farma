package playground.functions;


import playground.AnimalLabel2;
import playground.EAnimals;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

import static playground.PlaygroundPane.*;


//Gra 2 gi gracz
public class Dice2 extends JPanel {



    AnimalLabel2 smallDog2 = new AnimalLabel2();
    AnimalLabel2 bigDog2 = new AnimalLabel2();
    Buy2 b2 = new Buy2();
    Sell2 s2 = new Sell2();



    JButton buttonThrowDice2 = new JButton();
    JButton buttonDice12 = new JButton("Dodaj");
    JButton buttonDice22 = new JButton("Dodaj");
    JLabel labelFirstDice2 = new JLabel();
    JLabel labelSecondDice2 = new JLabel();

    JLabel labelBigDog2 = new JLabel();
    JLabel labelSmallDog2 = new JLabel();

    int animalDice12;
    int animalDice22;
    EAnimals[] animalsList = EAnimals.values();

    public Dice2() {
    }

    public void throwDice2(JPanel pane2, ArrayList<ArrayList<AnimalLabel2>> herd2) {
//        if (!Played) {
//            Played = true;
//            System.out.println("tym razem sie uda" + Played);
            smallDog2.getLabel().setIcon(EAnimals.SMALLDOG.getIconSize());
            bigDog2.getLabel().setIcon(EAnimals.BIGDOG.getIconSize());

            labelBigDog2.setIcon(EAnimals.BIGDOG.getIconSize());
            labelBigDog2.setBounds(1300, 750, 100, 100);


            labelSmallDog2.setIcon(EAnimals.SMALLDOG.getIconSize());
            labelSmallDog2.setBounds(1200, 750, 100, 100);

            if (bigDog2.isFree2() == false) {
                labelBigDog2.setVisible(true);
            } else {
                labelBigDog2.setVisible(false);
            }

            if (smallDog2.isFree2() == false) {
                labelSmallDog2.setVisible(true);
            } else {
                labelSmallDog2.setVisible(false);
            }

            labelFirstDice2.setBounds(970, 750, 100, 100);
            labelSecondDice2.setBounds(1080, 750, 100, 100);


            buttonThrowDice2.setText("Throw Dice");
            buttonThrowDice2.setBounds(800, 750, 100, 100);
            buttonThrowDice2.setIcon(EAnimals.getDiceIcon());
            System.out.println("rzut koscmi");

            buttonThrowDice2.setBounds(850, 750, 100, 100);
            buttonThrowDice2.setIcon(EAnimals.getDiceIcon());
            System.out.println("rzut koscmi");

            buttonDice12.setBounds(860, 750, 100, 50);
            buttonDice12.setVisible(false);
            buttonDice12.addActionListener(e -> {
                notSameValueOnDice2(pane2, animalDice12);
                buttonDice12.setVisible(false);
                buttonDice22.setVisible(false);
            });


            buttonDice22.setBounds(870, 750, 100, 50);
            buttonDice22.setVisible(false);
            buttonDice22.addActionListener(e -> {
                notSameValueOnDice2(pane2, animalDice22);
                buttonDice12.setVisible(false);
                buttonDice22.setVisible(false);
            });


            pane2.add(labelBigDog2);
            pane2.add(labelSmallDog2);
            pane2.add(buttonDice12);
            pane2.add(buttonDice22);
            pane2.add(buttonThrowDice2);


            buttonThrowDice2.addActionListener(action ->


            {
//            animalDice1 = 1;
//            animalDice2 = 1;
                animalDice12 = new Random().nextInt(8);
                animalDice22 = new Random().nextInt(8) + 1;

//            animalDice1 = new Random().nextInt(3);
//            animalDice2 = new Random().nextInt(3);

                labelFirstDice2.setIcon(animalsList[animalDice12].getIconSize());
                labelSecondDice2.setIcon(animalsList[animalDice22].getIconSize());


                if (animalDice12 == animalDice22) {
                    sameValueOnDice2(animalDice12, animalDice22);
                    System.out.println(" if costam");
                    buttonDice12.setVisible(false);
                    buttonDice22.setVisible(false);

                } else if (animalDice12 != animalDice22) {
                    System.out.println("kostka 1" + animalDice12 + " " + "kostka 2 " + animalDice22);
                    foxAndWolfs2(animalDice12, animalDice22);
                } else {
                    buttonDice12.setVisible(true);
                    buttonDice22.setVisible(true);
                }

                b2.buy2(pane2, herd2);
                s2.sell2(pane2, herd2);

            });
            pane2.add(labelFirstDice2);
            pane2.add(labelSecondDice2);


//        } else {
//            JOptionPane.showMessageDialog(this, "Gra gracz 1 teraz");
//        }
    }




        public void notSameValueOnDice2 (JPanel pane2,int animalDice12){
            switch (animalDice12) {
                case 6:
                    for (int i = 1; i < rabbitsRow2.size(); i++) {
                        if (rabbitsRow2.get(i).isFree2() == true && rabbitsRow2.get(i - 1).isFree2() == false) {
                            rabbitsRow2.get(i).getLabel().setIcon(animalsList[6].getIconSize());
                            rabbitsRow2.get(i).setFree(false);
                            System.out.println(i);
                            break;
                        }
                    }
                    break;
                case 5:
                    for (int i = 1; i < sheepsRow2.size(); i++) {
                        if (sheepsRow2.get(i).isFree2() == true && sheepsRow2.get(i - 1).isFree2() == false) {
                            sheepsRow2.get(i).getLabel().setIcon(animalsList[5].getIconSize());
                            sheepsRow2.get(i).setFree(false);
                            break;
                        }
                    }
                    break;
                case 4:
                    for (int i = 1; i < pigsRow2.size(); i++) {
                        if (pigsRow2.get(i).isFree2() == true && pigsRow2.get(i - 1).isFree2() == false) {
                            pigsRow2.get(i).getLabel().setIcon(animalsList[4].getIconSize());
                            pigsRow2.get(i).setFree(false);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i < cowRow2.size(); i++) {
                        if (cowRow2.get(i).isFree2() == true && cowRow2.get(i - 1).isFree2() == false) {
                            cowRow2.get(i).getLabel().setIcon(animalsList[3].getIconSize());
                            cowRow2.get(i).setFree(false);
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i < horseRow2.size(); i++) {
                        if (horseRow2.get(i).isFree2() == true && horseRow2.get(i - 1).isFree2() == false) {
                            horseRow2.get(i).getLabel().setIcon(animalsList[2].getIconSize());
                            horseRow2.get(i).setFree(false);
                            break;
                        }
                    }
                    break;
            }


        }

        public void sameValueOnDice2 ( int animalDice12, int animalDice22){
            if (animalDice12 == animalDice22) {
                buttonDice12.setVisible(false);
                buttonDice22.setVisible(false);
                switch (animalDice12) {
                    case 1:
                        labelSmallDog2.setIcon(animalsList[animalDice12].getIconSize());
                        labelSmallDog2.setVisible(true);
                        smallDog2.setFree(false);
                        System.out.println(smallDog2.isFree2());
                        break;
                    case 2:
                        horseRow2.get(0).getLabel().setIcon(animalsList[animalDice12].getIconSize());
                        horseRow2.get(0).setFree(false);
                        break;
                    case 3:
                        for (AnimalLabel2 a : cowRow2) {
                            if (a.isFree2() == true) {
                                a.getLabel().setIcon(animalsList[animalDice12].getIconSize());
                                a.setFree(false);
                                break;
                            }
                        }
                        break;
                    case 4:
                        for (AnimalLabel2 a : pigsRow2) {
                            if (a.isFree2() == true) {
                                a.getLabel().setIcon(animalsList[animalDice12].getIconSize());
                                a.setFree(false);
                                break;
                            }
                        }
                        break;

                    case 5:
                        for (AnimalLabel2 a : sheepsRow2) {
                            if (a.isFree2() == true) {
                                a.getLabel().setIcon(animalsList[animalDice12].getIconSize());
                                a.setFree(false);
                                break;
                            }
                        }
                        break;
                    case 6:
                        for (AnimalLabel2 a : rabbitsRow2) {
                            if (a.isFree2() == true) {
                                a.getLabel().setIcon(animalsList[animalDice12].getIconSize());
                                a.setFree(false);
                                break;
                            }
                        }
                        break;

                    case 7:
                        labelBigDog2.setIcon(animalsList[animalDice12].getIconSize());
                        labelBigDog2.setVisible(true);
                        bigDog2.setFree(false);
                        break;

                }
            }
        }

        public void foxAndWolfs2 ( int animalDice12, int animalDice22){
            if (animalDice12 == 0 && smallDog2.isFree2() == true && rabbitsRow2.get(0).isFree2() == false) {
                System.out.println("nie masz psa");
                System.out.println(" jeszcze nia ma psa " + smallDog2.isFree2());
                for (AnimalLabel2 a : rabbitsRow2) {
                    a.getLabel().setIcon(EAnimals.getWaterBear());
                    a.setFree(true);
                }
                labelSmallDog2.setVisible(false);
                System.out.println("gdzie jest pies " + smallDog2.isFree2());
//            JOptionPane.showMessageDialog(this, "Nie masz psa więc Lis zabrał wszystkie twoje króliki Do Luster");
            } else if (animalDice12 == 0 && smallDog2.isFree2() == false && rabbitsRow2.get(0).isFree2() == false) {
                System.out.println("masz psa");
                System.out.println("był pies " + smallDog2.isFree2());
                smallDog2.setFree(true);
                System.out.println("nie ma psa " + smallDog2.isFree2());
            }


            if (animalDice22 == 8 && bigDog2.isFree2() == true) {
                for (AnimalLabel2 rabbit : rabbitsRow2) {
                    rabbit.getLabel().setIcon(EAnimals.getWaterBear());
                    rabbit.setFree(true);
                }

                for (AnimalLabel2 sheep : sheepsRow2) {
                    sheep.getLabel().setIcon(EAnimals.getWaterBear());
                    sheep.setFree(true);
                }

                for (AnimalLabel2 pig : pigsRow2) {
                    pig.getLabel().setIcon(EAnimals.getWaterBear());
                    pig.setFree(true);
                }

                for (AnimalLabel2 cow : cowRow2) {
                    cow.getLabel().setIcon(EAnimals.getWaterBear());
                    cow.setFree(true);
                }
            } else if (animalDice22 == 8 && bigDog2.isFree2() == false) {
                bigDog2.setFree(true);
                labelBigDog2.setIcon(EAnimals.getWaterBear());
            }
//            JOptionPane.showMessageDialog(this, "Wilk dzięki swojej charyzmie został prezydentem galaktyki i wysłał wszystkich poza koniem do gwiazdozbioru Lutni");

        }
    }




