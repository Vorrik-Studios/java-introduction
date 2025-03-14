import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* OBJECT ORIENTED PROGRAMMING (OOP)
        * Take a look at this PowerPoint: https://1drv.ms/p/c/1ac3dee98978c804/ERr8WXvEONtOrsE_vFtG5okB8x3nJccACL-shwzMViXEBg?e=p6YzdD
        */

        /* ANONYMOUS CLASSES */
        Animal bengie = new Dog("bengie.png", "Bengie", 9);
        Animal jeremy = new Dog("jeremy.png", "Jeremy", 7);

        Animal sigma =  new Cat("sigma.png", "Sigma", 2);

        Bird jules = new Bird("jules.png", "Jules", 1);

        // Basically all an anonymous class is, is a class that has no name so can't be reused
        // This is basically an inline method
        // This could also be a Dog it just requires the {
        Animal joel = new Animal("joel.png", "Joel", 2) {
            @Override
            public void move() {
                System.out.println("Hamster is running in his wheel!");
            }

            @Override
            public void makeSound() {
                System.out.println("Hamster making tiny hamster noises");
            }
        };

        jules.move();
        jules.makeSound();
        jules.fly();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(jeremy);
        animals.add(sigma);
        animals.add(jules);
        animals.add(joel);

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
