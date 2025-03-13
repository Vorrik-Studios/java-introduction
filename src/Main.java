import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* CASTING */

        // Casting is turning one data type into another
        int health = 10;
        float damage = 1.5f;


        float resultFloat = health - damage; // Implicit!
        System.out.println("Result: " + resultFloat); // 8.5

        int result = (int)((float)health - damage); // Casting full expression explicitly    everything after the decimal point is removed
        System.out.println("Result: " + result); // 8

        int resultInt = health - (int)damage; // Explicit casting only damage from float to int
        System.out.println("Result: " + resultInt); // 9 everything after the decimal point is removed

        String point = "100";
        int resultInt2 = Integer.parseInt(point) + 5; // Casting the point string to an Integer + 5
        System.out.println("Result: " + resultInt2);
    }
}