package org.hogwarts.beast;

import org.hogwarts.Student;

import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private String skill;
    public Hippogriff(String name, int age, String color, String skill) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.skill = skill;
    }
    public Hippogriff(String name) {
        this.name = name;
    }
    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Hippogriff() {
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public String getSkill() {
        return skill;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void eat(String food) {
        if ("мясо".equalsIgnoreCase(food)) {
            System.out.println(name + " любит есть " + food + "!");
        }
        else if ("овощи".equalsIgnoreCase(food)) {
            System.out.println(name + " отказывается есть " + food + "!");
        }
        else {
            System.out.println(name + " неуверенно нюхает " + food + "!");
        }
    }
    public String fly() {
        if (age > 2) {
            return name + " летит!";
        }
        else {
            return name + " ещё слишком мал для полета.";
        }
    }
    public String giveRide(Student student) {
        int isGivingRide = new Random().nextInt(1, 10 + 1);
        if (isGivingRide <= 3) {
            return student.getName() + " летит на гиппогрифе!";
        }
        else if (isGivingRide >= 4 && isGivingRide <= 8) {
            return "Гиппогриф демонстративно отворачивается и отказывается летать";
        }
        else {
            return "Попробуй снова " + student.getName();
        }
    }
}
