package playground;

import javax.swing.*;
import java.awt.*;



public enum EAnimals {

    FOX(new ImageIcon("src/main/resources/lis.jpg")),
    BIGDOG(new ImageIcon("src/main/resources/duzypies.jpg")),
    HORSE(new ImageIcon("src/main/resources/kon.jpg")),
    COW(new ImageIcon("src/main/resources/krowa.jpg")),
    PIG(new ImageIcon("src/main/resources/swinka.jpg")),
    SHEEP(new ImageIcon("src/main/resources/owca.jpg")),
    RABBIT(new ImageIcon("src/main/resources/krolik.jpg")),
    SMALLDOG(new ImageIcon("src/main/resources/malypies.jpg")),
    WOLF(new ImageIcon("src/main/resources/wilk.jpg"));

    private ImageIcon icon;

    EAnimals(ImageIcon icon) {
        this.icon = icon;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public ImageIcon getIconSize() {
        Image image = icon.getImage();
        ImageIcon resizedIcon = new ImageIcon(image.getScaledInstance(110, 100, Image.SCALE_SMOOTH));
        return resizedIcon;
    }

    public static ImageIcon getWaterBear() {
       ImageIcon waterBeart = new ImageIcon("src/main/resources/niesporczak.jpg");
       Image image = waterBeart.getImage();
       ImageIcon resWB = new ImageIcon(image.getScaledInstance(110,100,Image.SCALE_SMOOTH));
       return  resWB;
    }

    public static ImageIcon getDiceIcon() {
        ImageIcon waterBeart = new ImageIcon("src/main/resources/dice.jpg");
        Image image = waterBeart.getImage();
        ImageIcon resWB = new ImageIcon(image.getScaledInstance(110,100,Image.SCALE_SMOOTH));
        return  resWB;
    }


}
