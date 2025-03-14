public class Dog {
    public String picture; // accessible from anywhere and changeable
    protected String name; // accessible in subclasses and same package
    private int age;       // accessible ONLY withing the class itself

    public static int numberOfDogs = 0; // Means there is one copy shared by all dogs
    // Basically a global value among the class in this case Dog

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;

        numberOfDogs++;
    }

    public void birthday() {
        age++;
    }

    // Setter
    public void setAge(int num) {
        this.age = num;
    }

    // Getter
    public int getAge() {
        return age;
    }
}
