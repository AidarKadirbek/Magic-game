package org.hogwarts.items;


import org.hogwarts.Student;

public class Car implements Invisible {
    private Student driver;
    private int speed;
    private boolean isFlying;

    public Car(Student driver, int speed, boolean isFlying) {
        this.driver = driver;
        this.speed = speed;
        this.isFlying = isFlying;
    }

    public Student getDriver() {
        return driver;
    }
    public void setDriver(Student driver) {
        this.driver = driver;
    }
    public int getSpeed() {
        return speed; }
    public boolean getIsFlying() {
        return isFlying;
    }
    public void setSpeed(int speed) {
        this.speed = speed; }
    public void setFlying(boolean isFlying) {
        this.isFlying = isFlying; }


    @Override
    public void becomeVisible() {
        System.out.println("The car is visible");
    }
    public void becomeInvisible() {
        System.out.println("The car is invisible");
    }
}
