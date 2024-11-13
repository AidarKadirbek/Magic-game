package org.hogwarts.items;

public class Cloak implements Invisible{
    private int capacity = 3;
    private int weight;

    public Cloak(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }
    @Override
    public void becomeInvisible() {
        System.out.println("The people invisible now");
    }

    @Override
    public void becomeVisible() {
        System.out.println("The people visible now");

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
