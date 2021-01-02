import java.util.ArrayList;
import java.util.List;

public class Check {

    public static double checkPresiceRound(double n) {

        double sub = n;
        while (true) {
            sub -= 0.1;
            if (sub < 0.1) {
                break;
            }
        }

        if (sub < 0.05) {
            return n - sub;
        }

        else {
            return n + (0.1 - sub);
        }
    }

    public static void check() {

        List<Double> tests = new ArrayList<>();
        tests.add(10.1);
        tests.add(10.15);
        tests.add(110.23);
        tests.add(200.0);
        tests.add(5.153321);

        int passed = 0;

        for (int i = 0; i < tests.size(); i++) {
            if (Main.presiceRound(tests.get(i)) == checkPresiceRound(tests.get(i))) {
                System.out.println("Test: " + tests.get(i) + " - passed");
                passed++;
            }
            else {
                System.out.println("Test: " + tests.get(i) + " - failed");
            }
        }

        if (passed == tests.size()) {
            System.out.println("Solution accepted - " + passed + "/" + tests.size() + " test cases passed");
        }
        else {
            System.out.println("Solution rejected - " + passed + "/" + tests.size() + " test cases passed");
        }
    }
}
