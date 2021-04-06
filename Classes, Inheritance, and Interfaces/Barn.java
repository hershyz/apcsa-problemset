import java.util.ArrayList;
import java.util.List;

public class Barn {

    List<Animal> animals = new ArrayList<>();

    //Add all animals in 'animalArg' to 'animals' in the constructor using iteration:
    public Barn(List<Animal> animalArg) {
        for (Animal a : animalArg) {
            animals.add(a);
        }
    }

    //Return the name string of the animal with the longest name:
    public String getLongestName() {
        String name = "";
        int longest = 0;
        for (Animal x : animals) {
            if (x.getName().length() > longest) {
                longest = x.getName().length();
                name = x.getName();
            }
        }
        return name;
    }

    //Return the name of the tallest animal:
    public String getTallest() {
        String name = "";
        int tallest = 0;
        for (Animal x : animals) {
            if (x.getHeight() > tallest) {
                tallest = x.getHeight();
                name = x.getName();
            }
        }
        return name;
    }

    //Return the animals ArrayList:
    public List<Animal> getAnimals() {
        return animals;
    }
}
