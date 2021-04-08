public class Check {

    private static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void check() {

        String[] foods = {"grass", "hay"};
        Cow c = new Cow(foods);
        int passed = 0;

        String[] returned = c.getFoods();
        if (compare(foods, returned)) {
            System.out.println("Test: Cow.getFoods() and Cow.Cow() - passed");
            passed++;
        }
        else {
            System.out.println("Test: Cow.getFoods() and Cow.Cow() - failed");
        }

        String noise = c.makeNoise();
        if (noise.equals("Moo!")) {
            System.out.println("Test: Cow.makeNoise() - passed");
            passed++;
        }
        else {
            System.out.println("Test: Cow.makeNoise() - failed");
        }

        boolean eatHay = c.eat("hay");
        boolean eatBurger = c.eat("burger");
        if (eatHay && !eatBurger) {
            System.out.println("Test: Cow.eat() - passed");
            passed++;
        }
        else {
            System.out.println("Test: Cow.eat() - failed");
        }

        if (passed == 3) {
            System.out.println("Solution accepted: 3/3 test cases passed");
        }
        else {
            System.out.println("Solution rejected: " + passed + "/3 test cases passed");
        }
    }
}
