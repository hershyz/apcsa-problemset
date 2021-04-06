public class Cow extends Animal {

    //Use the super() keyword to trigger the parent constructor:
    public Cow(String name, int age, int height) {
        super(name, age, height);
    }

    //Return "Moo!" when this function is called:
    public String getSound() {
        return "Moo!";
    }
}
