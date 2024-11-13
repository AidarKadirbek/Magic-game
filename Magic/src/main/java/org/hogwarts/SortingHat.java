package org.hogwarts;

import java.util.Scanner;

public class SortingHat {
    Scanner scanner = new Scanner(System.in);
    public void sort() {
        String q1 = "Ты предпочитаешь работать в команде? (Да/Нет)";
        String q2 = "Ты любишь разгадывать головоломки? (Да/Нет)";
        String q3 = "Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)";
        String q4 = "Ты проявляешь заботу к существам и природе? (Да/Нет)";
        System.out.println(q1);
        String a1 = scanner.nextLine();
        System.out.println(q2);
        String a2 = scanner.nextLine();
        System.out.println(q3);
        String a3 = scanner.nextLine();
        System.out.println(q4);
        String a4 = scanner.nextLine();
        if (a1.equals("Да")) {
            if (a3.equals("Да")) {
                System.out.println("Гриффиндор");
            }
            else if (a4.equals("Да")) {
                System.out.println("Пуффендуй");
            }
            else if (a2.equals("Да")) {
                if (a1.equals("Да")) {
                    System.out.println("Когтевран");
                } else if (a3.equals("Да")) {
                    System.out.println("Когтевран");
                }
                else {
                    System.out.println("Слизерин");
                }
            }
            else {
                System.out.println("Пуффендуй");
            }
        }

    }
}
