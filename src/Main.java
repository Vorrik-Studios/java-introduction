public class Main {
    public static void main(String[] args) {
        /* OBJECT ORIENTED PROGRAMMING (OOP)
        * Take a look at this PowerPoint: https://1drv.ms/p/c/1ac3dee98978c804/ERr8WXvEONtOrsE_vFtG5okB8x3nJccACL-shwzMViXEBg?e=p6YzdD
        */

        /* CLASSES & OBJECTS */
        // CLASSES SHOULD ALWAYS START WITH A CAPITAL LETTER
        // This time you have to look at multiple files

        Dog bengie = new Dog("bengie.png", "Bengie", 9);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 7);

        System.out.println("Bengie age " + bengie.age);
        System.out.println("Jeremy age " + jeremy.age);

        bengie.birthday();

        System.out.println("Bengie age " + bengie.age);
        System.out.println("Jeremy age " + jeremy.age);

        jeremy.age = 100;

        System.out.println("Bengie age " + bengie.age);
        System.out.println("Jeremy age " + jeremy.age);
    }
}
