public class Main {
    public static void main(String[] args) {
        /* OBJECT ORIENTED PROGRAMMING (OOP)
        * Take a look at this PowerPoint: https://1drv.ms/p/c/1ac3dee98978c804/ERr8WXvEONtOrsE_vFtG5okB8x3nJccACL-shwzMViXEBg?e=p6YzdD
        */

        /* ACCESS MODIFIERS */

        System.out.println("How many dogs are there? " + Dog.numberOfDogs);

        Dog bengie = new Dog("bengie.png", "Bengie", 9);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 7);

        System.out.println("Bengie age " + bengie.getAge());
        System.out.println("Jeremy age " + jeremy.getAge());

        bengie.birthday();

        System.out.println("Bengie age " + bengie.getAge());
        System.out.println("Jeremy age " + jeremy.getAge());

        System.out.println("How many dogs are there? " + Dog.numberOfDogs);

        Dog charlie = new Dog("charlie.png", "Charlie", 11);

        System.out.println("How many dogs are there? " + Dog.numberOfDogs);

    }
}
