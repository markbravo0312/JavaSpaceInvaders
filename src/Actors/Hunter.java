package Actors;

import javax.swing.*;

public class Hunter extends Actor {

    private int width;
    private final int START_X = 270;
    private final int START_Y = 280;

    private void initHunter() {
        var hunterImage = new ImageIcon("src/Images/pickachu.png");
        setWidth(hunterImage.getImage().getWidth(null));
        setImage(hunterImage.getImage());

        setPosx(START_X);
        setPosy(START_Y);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    
}
