import java.util.ArrayList;
import java.util.List;

public class BasicCasting {

    public static void main(String[] args) {

        int numberA = 33;

        double numberB = numberA;
        int numberC = (int) numberB;

        System.out.println(numberB);
        System.out.println(numberC);

        char symbolD = 'A';

        int symbolE = (int) symbolD;
        char symbolF = (char) symbolD;

        System.out.println(symbolE);
        System.out.println(symbolF);


        Animal corgi = new Dog("corgi");

        corgi.makeSound();
        ((Dog) corgi).play();

        Animal snow = new Cat("snow");
        snow.makeSound();
        ((Cat) snow).scratch();

        Animal blackpearl = new Cat("blackpearl");
        Animal golden = new Dog("golden");

        List<Animal> animals = new ArrayList<>();
        animals.add(corgi);
        animals.add(snow);
        animals.add(blackpearl);
        animals.add(golden);

        for (Animal pet : animals) {
            if (pet instanceof Cat) System.out.println(pet.getName() + " is a cat");
            else if (pet instanceof Dog) System.out.println(pet.getName() + " is a dog");
        }
    }
}
