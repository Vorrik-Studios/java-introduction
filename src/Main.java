import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* ASSIGNMENT OPERATORS */

        // Assignment =
        int mana = 100;
        System.out.println("Mana: " + mana);

        // Addition +=
        mana += 20; // mana = mana + 20
        System.out.println(mana);

        mana++; // mana += 1
        System.out.println(mana);

        // Subtraction -=
        mana -= 20; // mana = mana - 20
        System.out.println(mana);

        mana--; // mana -= 1
        System.out.println(mana);

        // Multiplication *=
        mana *= 2;
        System.out.println(mana);

        // Division /=
        mana /= 4;
        System.out.println(mana);

        // Modulus (Remainder) %=
        mana %= 2;
        System.out.println(mana);
    }
}