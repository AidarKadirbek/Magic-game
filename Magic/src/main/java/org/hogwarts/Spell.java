package org.hogwarts;

import java.util.Random;

public class Spell {
    private int title;
    private int power;

    public Spell(int title, int power) {
        this.title = title;
        this.power = power;
    }
    public int getTitle() {
        return title;
    }
    public int getPower() {
        return power;
    }
    public void setTitle(int title) {
        this.title = title;
    }
    public void setPower(int power) {
        if (power >= 1 && power <= 7) {
            this.power = power;
        }
        else {
            System.out.println("Power must be between 1 and 7.");
        }
    }

}
