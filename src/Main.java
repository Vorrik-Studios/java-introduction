import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        /* ARRAYS */

        String question1 = "What does WWW stand for?";
        String question2 = "What is the World's Largest Ocean?";
        String question3 = "Which Year did East and West Germany Unify?";

        String answer1 = "World Wide Web";
        String answer2 = "Pacific Ocean";
        String answer3 = "1990";

        // Now add 15 more ...   Don't actually just get into the mindset of possibly having to add the small amount of 15 more questions
        // How do we print these easily?

        for (int i = 0; i < 3; i++) {
            // System.out.println(questioni); Well this doesn't work so hmm how do we do this
        }

        // Array - Think of this as a list
        String[] questions = new String[3]; // Makes a new array called questions of size 3
        // The array starts with index 0 not 1
        // Basically every programming language starts at index 0 but a select few need to be special and start at something like 1 an example would be lua
        questions[0] = "What does WWW stand for?";
        questions[1] = "What is the World's Largest Ocean?";
        questions[2] = "Which Year did East and West Germany Unify?";

        String[] answers = new String[3]; // Makes a new array called answers of size 3
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "1990";

        // Using Array.getLength(questions) to loop through every one of them every time even if you change the size of the array
        for (int i = 0; i < Array.getLength(questions); i++) {
            System.out.println("Q: " + questions[i] + " | A: " + answers[i]); // Much better this works unlike the other for loop
        }
    }
}