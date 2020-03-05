package playground;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public enum EAnimals {
    FOX(new ImageIcon("src/main/resources/duzypies.jpg")),
    BIGDOG(new ImageIcon("src/main/resources/duzypies.jpg")),
    HORSE(new ImageIcon("src/main/resources/duzypies.jpg")),
    RABBIT(new ImageIcon("src/main/resources/duzypies.jpg")),
    COW(new ImageIcon("src/main/resources/duzypies.jpg")),
    SMALLDOG(new ImageIcon("src/main/resources/duzypies.jpg")),
    SHEEP(new ImageIcon("src/main/resources/duzypies.jpg")),
    PIG(new ImageIcon("src/main/resources/duzypies.jpg")),
    WOLF(new ImageIcon("src/main/resources/wils.jpg"));

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
        return  resizedIcon;
    }

}
