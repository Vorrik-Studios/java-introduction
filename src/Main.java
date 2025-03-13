import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* STRINGS & STRING METHODS */

        String name = "Landon";
        String activity = "learn";

        activity = activity + "ing";

        System.out.println("My name is " + name + " and I am currently " + activity + ".");

        String sentence = " Hello, how are you doing?";
        System.out.println(sentence);

        // Upper Case or Lower Case
        System.out.println("Lower Case: " + sentence.toLowerCase());
        System.out.println("Upper Case: " + sentence.toUpperCase());

        // Contain
        System.out.println("Does it contain \"Howdy\": " + sentence.contains("Howdy"));

        // Replacing
        System.out.println(sentence.replace("Hello", "Howdy"));

        // charAt
        System.out.println(sentence.charAt(7));

        // Original String is not modified
        System.out.println(sentence);

        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();

        System.out.println(test.equals("Hello"));
    }
}