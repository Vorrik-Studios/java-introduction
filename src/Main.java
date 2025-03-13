public class Main {
    public static void main(String[] args) {
        /* INTEGERS & MATH */

        int a = 100;
        int b = 200;

        // ADDITION
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum); // Printing the sum of the two numbers (a and b)

        // SUBTRACTION
        int dif = a - b;
        System.out.println("Difference of " + a + " and " + b + " is: " + dif); // Printing the difference of the two numbers (a and b)

        // MULTIPLICATION
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is: " + product); // Printing the product of the two numbers (a and b)

        // DIVISION
        int Quotient = a / b; // Is 0 because an integer is only a whole number
        System.out.println("Quotient of " + a + " and " + b + " is: " + Quotient); // Printing the quotient of the two numbers (a and b)
        Quotient = b / a;
        System.out.println("Quotient of " + b + " and " + a + " is: " + Quotient); // Printing the quotient of the two numbers (a and b)

        // REMAINDER (MODULUS)
        int remainder = 100 % 2; // Can be used to figure out if a variable (number) is even or odd
        System.out.println("Remainder from 100/2 " + remainder);

        remainder = 100 % 3;
        System.out.println("Remainder from 100/3 " + remainder);

        remainder = 100 % 4;
        System.out.println("Remainder from 100/4 " + remainder);

        // MATH METHODS
        System.out.println("Ceiling of: 1.23: " + Math.ceil(1.23)); // Round up
        System.out.println("Round of: 1.23: " + Math.round(1.23)); // Rounding
        System.out.println("Floor of: 1.23: " + Math.floor(1.23)); // Rounding down
        System.out.println("Absolute of: -100: " + Math.abs(-100)); // Absolute value
        System.out.println("Minimum of: 10 and 200 : " + Math.min(10, 200)); // Minimum
        System.out.println("Maximum of: 10 and 200 : " + Math.max(37, 750)); // Maximum
    }
}