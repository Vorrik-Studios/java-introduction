// abstract makes it only work with subclasses / inheritance
public abstract class Animal {
    private String picture;
    public String name;
    private int age;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public abstract void move();

    public void makeSound() {
        System.out.println("Whatever Animal Sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Image: " + picture);
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
        System.out.println(name +" is celebrating their Birthday! They turned " + age + "!");
    }

    public String picture() {
        return picture;
    }

    public void updatePicture(String picture) {
        this.picture = picture;
    }
}
