public class Main {
    // This is a public static method that returns nothing (void) and takes an array of strings (args) as an argument.
    public static void main(String[] args) {

        /* Methods */

        // Going beyond the main method!

        // Create an array of Strings to store 4 questions
        String[] questions = new String[4];
        questions[0] = "What does WWW stand for?";  // First question
        questions[1] = "What is the World's Largest Ocean?";  // Second question
        questions[2] = "Which Year did East and West Germany Unify?";  // Third question
        questions[3] = "What is the capital of France?";  // Fourth question

        // Create an array of Strings to store the answers corresponding to each question
        String[] answers = new String[4];
        answers[0] = "World Wide Web";  // Answer for the first question
        answers[1] = "Pacific Ocean";  // Answer for the second question
        answers[2] = "1990";  // Answer for the third question
        answers[3] = "Paris";  // Answer for the fourth question

        // Loop to call outputQuestionsAndAnswers 5 times and display the questions and answers
        // This will print the questions and answers 5 times in a loop
        for (int x = 0; x < 5; x++) {
            // Calls the method to print the questions and answers without a count argument
            outputQuestionsAndAnswers(questions, answers);  // Calls method with no count argument
        }

        // The call below is an alternative way to call outputQuestionsAndAnswers using a count argument.
        // This achieves the same output as the previous loop but demonstrates how to use the count parameter.
        outputQuestionsAndAnswers(5, questions, answers);  // Calls method with a count argument, printing 5 times

    }

    /*
     * Naming conventions for Java: method names should be in camelCase,
     * starting with a lowercase letter and using meaningful names.
     * For example, sum method name follows this convention.
     *
     * This is a public static method named sum that returns an integer and takes two integer parameters,
     * named x and y. It returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        // Adds the two integers (x and y) and returns the result
        return x + y;  // Return the sum of x and y
    }


    /*
     * public:
     *      This is an access modifier that means the method is accessible from any other class or package.
     *      It is necessary for the method to be public if you want it to be called from outside the class where it's defined.
     *      In this case, it's making the method accessible from other parts of the program (e.g., the main method).
     *
     * static:
     *      This keyword means that the method belongs to the class itself, rather than to instances (objects) of the class.
     *      It allows the method to be called without creating an instance (object) of the class.
     *      In this case, the method `outputQuestionsAndAnswers` can be called directly on the class without needing an object.
     *
     * void:
     *      This keyword indicates that the method does **not return any value**. It is used when a method's primary task is to perform an action (such as printing output),
     *      but it doesn't need to send any result back to the caller.
     *
     * outputQuestionsAndAnswers:
     *      This is the **method name**. It's a unique identifier used to call this method. It should be meaningful and describe the purpose of the method.
     *      In this case, the name indicates that the method will output (print) the questions and their corresponding answers.
     *
     * (int count, String[] questions, String[] answers):
     *      These are the **parameters** of the method. They specify the inputs the method requires in order to perform its task:
     *      - `int count`: An integer that determines how many times the questions and answers should be printed.
     *      - `String[] questions`: An array of Strings that contains the questions to be printed.
     *      - `String[] answers`: An array of Strings that contains the answers corresponding to each question.
     */

    public static void outputQuestionsAndAnswers(int count, String[] questions, String[] answers) {
        // Loop 'count' times to print the questions and answers multiple times
        for (int x = 0; x < count; x++) {
            // Loop through each question and print it with its corresponding answer
            for (int i = 0; i < questions.length; i++) {
                System.out.println("Q: " + questions[i] + " | A: " + answers[i]);  // Prints question and answer
            }
        }
    }

    /*
     * The method below and above are named outputQuestionsAndAnswers, but they have different parameter lists.
     * This is called **method overloading**, which allows multiple methods with the same name but different parameters.
     * One method takes a count parameter to specify how many times to display the questions, while the other does not.
     */

    /*
     * This method is a simpler version that does not take a count parameter.
     * It simply prints each question and answer once.
     */
    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
        // Loop through the questions and print each one with its corresponding answer
        for (int i = 0; i < questions.length; i++) {
            // Prints question and answer once for each pair
            System.out.println("Q: " + questions[i] + " | A: " + answers[i]);
        }
    }
}
