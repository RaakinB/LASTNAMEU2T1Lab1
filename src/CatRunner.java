public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Tabitha", 2, 30, true);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Nina", 7, 40, false);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
