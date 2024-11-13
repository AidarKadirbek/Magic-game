package org.hogwarts;

import java.util.Random;

public class Quidditch {
    public void getBalls() {
        for (int i = 1; i <= 3; i++) {
            System.out.print("Запущен мяч под названием ");
            if (i == 1) {
                System.out.print("Quaffle ");
            } else if (i == 2) {
                System.out.print("Bludger ");
            } else if (i == 3) {
                System.out.println("Golden Snitch ");
            }
        }
    }
    public void playGame() {
        int i = 0;
        while(true) {
            int control = new Random().nextInt(100);
            i++;
            System.out.println(i);
            if (control == 7) {
                System.out.println("Снитч пойман!");
                break;
            }
        }
    }
}
