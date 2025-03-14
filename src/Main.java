public class Main {
    public static void main(String[] args) {
        /* OBJECT ORIENTED PROGRAMMING (OOP)
        * Take a look at this PowerPoint: https://1drv.ms/p/c/1ac3dee98978c804/ERr8WXvEONtOrsE_vFtG5okB8x3nJccACL-shwzMViXEBg?e=p6YzdD
        */

        /* INHERITANCE & POLYMORPHISM */
        Dog bengie = new Dog("bengie.png", "Bengie", 9);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 7);
        Cat sigma =  new Cat("sigma.png", "Sigma", 2);

        bengie.displayInfo();
        jeremy.displayInfo();
        sigma.displayInfo();

        bengie.birthday();

        bengie.displayInfo();
        jeremy.displayInfo();
        sigma.displayInfo();

        bengie.birthday();
        jeremy.birthday();
        sigma.birthday();

        bengie.displayInfo();
        jeremy.displayInfo();
        sigma.displayInfo();

        bengie.makeSound();
        jeremy.makeSound();
        sigma.makeSound();
    }
}
