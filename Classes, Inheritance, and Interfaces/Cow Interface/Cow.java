public class Cow implements Animal {

    String[] foods;

    //Set 'foods' equal to 'acceptableFoods'
    public Cow(String[] acceptableFoods) {
        foods = new String[acceptableFoods.length];
        for (int i = 0; i < acceptableFoods.length; i++) {
            foods[i] = acceptableFoods[i];
        }
    }

    public String makeNoise() {
        return "Moo!";
    }

    public boolean eat(String food) {
        for (String x : foods) {
            if (x.equals(food)) {
                return true;
            }
        }
        return false;
    }

    public String[] getFoods() {
        return foods;
    }
}
