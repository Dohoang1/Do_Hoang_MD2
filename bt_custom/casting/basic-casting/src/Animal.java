class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat extends Animal
{
    public Cat(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void scratch() {
        System.out.println("Cat is scratching");
    }
}