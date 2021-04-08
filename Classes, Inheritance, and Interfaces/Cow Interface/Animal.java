public interface Animal {

    //Return 'Moo!':
    String makeNoise();

    //Return true if 'food' is contained within 'foods', and false if it is not:
    boolean eat(String food);

    //Return the list of accepted foods:
    String[] getFoods();
}
