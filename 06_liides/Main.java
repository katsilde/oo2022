public class Main {
    public static void main(String[] args) {
        var Yarn_nr1 = new Woolen("Regia", 50, 3.2, "blue");
        var Yarn_nr2 = new Woolen("Regia", 150, 5.4, "green");

        System.out.println(Yarn_nr1.printInfo());
        System.out.println(Yarn_nr2.printInfo());

    }
}
