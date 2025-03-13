import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* TERNARY OPERATOR */

        int health = 3;
        String status = "";
        System.out.println("What is your status? " + status);

        // No Ternary Operator
        if (health > 0) {
            status = "Alive";
        } else {
            status = "Non-Alive";
        }

        System.out.println("What is your status? " + status);
        status = "";

        health = 0;
        // Ternary Operator / One line if else statement
        status = health > 0 ? "Alive" : "Non-Alive";
        System.out.println("What is your status? " + status);
    }
}