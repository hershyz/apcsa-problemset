import java.util.ArrayList;
import java.util.List;

public class Check {

    private static boolean compare(Animal a, Animal b) {
        if (a.getName().equals(b.getName())) {
            if (a.getHeight() == b.getHeight()) {
                if (a.getAge() == b.getAge()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void check() {

        int passed = 0;
        List<Animal> animals = new ArrayList<>();
        Cow bob = new Cow("Bob", 1, 5);
        Cow joe = new Cow("Joe", 2, 20);
        Cow harry = new Cow("Harry", 3, 10);
        animals.add(bob);
        animals.add(joe);
        animals.add(harry);

        String name = bob.getName();
        if (name.equals("Bob")) {
            System.out.println("Test: Animal.getName() - passed");
            passed++;
        }
        else {
            System.out.println("Test: Animal.getName() - failed");
        }

        int age = joe.getAge();
        if (age == 2) {
            System.out.println("Test: Animal.getAge() - passed");
            passed++;
        }
        else {
            System.out.println("Test: Animal.getAge() - failed");
        }

        int height = harry.getHeight();
        if (height == 10) {
            System.out.println("Test: Animal.getHeight() - passed");
            passed++;
        }
        else {
            System.out.println("Test: Animal.getHeight() - failed");
        }

        String sound = bob.getSound();
        if (sound.equals("Moo!")) {
            System.out.println("Test: Cow.getSound() - passed");
            passed++;
        }
        else {
            System.out.println("Tets: Cow.getSound() - failed");
        }

        Barn barn = new Barn(animals);
        boolean equal = true;
        List<Animal> recieved = barn.getAnimals();
        for (int i = 0; i < recieved.size(); i++) {
            Animal a = animals.get(i);
            Animal b = recieved.get(i);
            if (!compare(a, b)) {
                equal = false;
            }
        }

        if (equal) {
            System.out.println("Test: Barn.Barn() and Barn.getAnimals() - passed");
            passed++;
        }
        else {
            System.out.println("Test: Barn.Barn() and Barn.getAnimals() - failed");
        }

        String longest = barn.getLongestName();
        if (longest.equals("Harry")) {
            System.out.println("Test: Barn.getLongestName() - passed");
            passed++;
        }
        else {
            System.out.println("Test: Barn.getLongestName() - failed");
        }

        String tallest = barn.getTallest();
        if (tallest.equals("Joe")) {
            System.out.println("Test: Barn.getTallest() - passed");
            passed++;

        }
        else {
            System.out.println("Test: Barn.getTallest() - failed");
        }

        if (passed == 7) {
            System.out.println("Solution accepted: 7/7 test cases passed");
        }
        else {
            System.out.println("Solution rejected: " + passed + "/7 test cases passed");
        }
    }
}
