// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    private boolean love;

    // constructor
    public Cat(String catName, int catAge, double catWeight, boolean loveYou) {
        name = catName;
        age = catAge;
        weight = catWeight;
        love = loveYou;
    }

    // method that introduces the Cat
    public void introduce() {
        if (age < 7) {
            System.out.println("Hello my name is " + name + ", I am a younger cat.");
        } else {
            System.out.println("Hello my name is " + name + ", I am an older cat.");
        }
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Do I love you is: " + love);
    }
}

