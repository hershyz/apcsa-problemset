public class Animal {

    String name;
    int age;
    int height;

    //Initialize name, age, and height to the parameters:
    public Animal(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //Return the name:
    public String getName() {
        return name;
    }

    //Return the age:
    public int getAge() {
        return age;
    }

    //Return the height:
    public int getHeight() {
        return height;
    }
}
