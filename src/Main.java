import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* LOOPS (FOR & WHILE) */

        // FOR

        // Outputs every number from 0 to 100
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("-----");
        System.out.println(" ");

        // Outputs every even number from 0 to 100
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println(" ");
        System.out.println("-----");
        System.out.println(" ");

        // Outputs every leap year from 1000 to 2000
        for (int i = 1000; i <= 2000; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i);
            }
        }


        // WHILE
        // Be careful with this one as it can enter an infinite loop if not handled correctly

        int health = 10;
        while (health > 0) {
            health--;

            if (health == 6) {
                continue; // Continues the loop without doing anything more
            }

            if (health == 2) {
                break; // Stops the loop
            }

            System.out.println("Player still alive with: " + health + " HP");
        }
        System.out.println("Player Died");
    }
}