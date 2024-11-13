package org.hogwarts;

import org.hogwarts.beast.Hippogriff;
import org.hogwarts.items.Car;
import org.hogwarts.items.Cloak;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"super patronus", "catcher", "smart"};
        Student harry = new Student("Harry", "Gryffindor", 17, skills);

        Car harrysCar = new Car(harry, 120, true);
        if (harrysCar.getIsFlying()) {
            harrysCar.becomeInvisible();
        }
        else {
            harrysCar.becomeVisible();
        }

        Cloak invisibilityCloak = new Cloak(3, 10);
        if (invisibilityCloak.getCapacity() > 0 && invisibilityCloak.getCapacity() <= 3) {
            invisibilityCloak.becomeInvisible();
        } else {
            invisibilityCloak.becomeVisible();
        }

    }
    public static void castsSpell() {
        String s = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        System.out.println(s.toLowerCase());
        int start = new Random().nextInt(50);
        System.out.println(start);
        String r = s.substring(start);
        System.out.println(r);
        StringBuilder builder = new StringBuilder();
        builder.append(r);
        builder.reverse();
        int zero = builder.charAt(0);
        int one = builder.charAt(1);
        System.out.println(zero);
        System.out.println(one);
        builder.replace(0, 1, String.valueOf(one));
        builder.replace(1, 2, String.valueOf(zero));
        System.out.println(builder);
    }
}