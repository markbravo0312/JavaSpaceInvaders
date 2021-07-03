package Actors;

import java.awt.*;

public abstract class Actor {

    private boolean Visible;
    private boolean isDead;
    private Image image;
    private int posx;
    private int posy;
    private int dx;

    //setters
    public void setVisible(boolean visible) {
        Visible = visible;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    //getters
    public boolean isVisible() {
        return Visible;
    }

    public boolean isDead() {
        return isDead;
    }

    public Image getImage() {
        return image;
    }

    public int getDx() {
        return dx;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }


    public void moveLeft () {

    }

    public void moveRight () {

    }

    public void Shoot() {

    }

    public void Die() {
        this.Visible = false;
    }

    public Actor() {
        this.Visible = true;
    }

}
