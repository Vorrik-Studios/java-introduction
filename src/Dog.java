public class Dog extends Animal {
    public Dog(String picture, String name, int age) {
        super(picture, name, age); // Super refers to the super class (Animal) in this case
    }

    @Override
    public void makeSound() {
        System.out.println("BARK");
    }
}
