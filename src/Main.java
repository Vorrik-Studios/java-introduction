import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* BOOLEANS & LOGIC */

        // Booleans are either true (1) or false (0)
        boolean learning = true;
        boolean learningSucks = false;
        System.out.println("Learning is so fun " + !learningSucks); // Prints Learning is so fun and the opposite of the learningSucks variable
        System.out.println("Learning right now " + learning);

        // COMPARISONS (<, <=, >=, >, ==, !=)
        // Operators in order: less than, less than or equal to, greater than or equal to, greater than, equal to, not equal to

        int points = 76;
        int pointsToPass = 55;
        boolean hasPassedTest = points >= pointsToPass;
        System.out.println("Has passed the Test? " + hasPassedTest);

        int health = 0;
        boolean isAlive = health > 0;
        System.out.println("Still alive? " + isAlive);

        boolean example = 100 == 100; // true
        example = 100 != 100; // false
        example = 100 < 100; // false
        example = 100 > 100; // false
        example = 100 <= 100; // true
        example = 100 >= 100; // true

        // LOGIC (AND, OR, NOT)

        /*
        * OR
        * In1 | In2 | Result
        *  0  |  0  |   0
        *  1  |  0  |   1
        *  0  |  1  |   1
        *  1  |  1  |   1
        *
        * AND
        * In1 | In2 | Result
        *  0  |  0  |   0
        *  1  |  0  |   0
        *  0  |  1  |   0
        *  1  |  1  |   1
        *
        * NOT
        *  In | !In    NOTE: ! is the opposite of something
        *  0  |  1
        *  1  |  0
        * */

        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2; // && is the AND operator  true if both are true

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put in true or false, are you from America?");
        boolean isEuropean = scanner.nextBoolean();

        int usDrinkingAge = 21;
        int euDrinkingAge = 18;

        boolean canDrink = !isEuropean && age >= euDrinkingAge || isEuropean && age >= usDrinkingAge;
        System.out.println("Can you drink? " + canDrink);

    }
}