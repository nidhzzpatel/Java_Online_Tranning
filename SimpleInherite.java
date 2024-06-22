class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class SimpleInherite {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        System.out.println("Animal:");
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        animal.makeSound();

        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println("\nDog:");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
        dog.makeSound();
    }
}
