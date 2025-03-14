import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* OBJECT ORIENTED PROGRAMMING (OOP)
        * Take a look at this PowerPoint: https://1drv.ms/p/c/1ac3dee98978c804/ERr8WXvEONtOrsE_vFtG5okB8x3nJccACL-shwzMViXEBg?e=p6YzdD
        */

        /* INTERFACE & ABSTRACTION */
        Animal bengie = new Dog("bengie.png", "Bengie", 9);
        Animal jeremy = new Dog("jeremy.png", "Jeremy", 7);

        Animal sigma =  new Cat("sigma.png", "Sigma", 2);

        Bird jules = new Bird("jules.png", "Jules", 1);

        jules.move();
        jules.makeSound();
        // You can't do jules.fly if you say in the declaration jules is an Animal so we have to cast it to the Bird class
        // You could also just say jules is a Bird instead of Animal when declaring
        // ((Bird) jules).fly();
        jules.fly();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(jeremy);
        animals.add(sigma);
        animals.add(jules);

        List<IFlyable> flyables = new ArrayList<>();
        flyables.add(jules);
        flyables.add(new Airplane());

        for(Animal animal : animals) {
            animal.move();
            animal.makeSound();
        }

        for (IFlyable flyable : flyables) {
            flyable.fly();
        }
    }
}
