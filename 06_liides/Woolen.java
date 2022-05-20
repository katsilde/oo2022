public class Woolen implements Yarn {
    String type = "Woolen";
    String brand = Yarn.brandName;
    int weight1 = Yarn.weight;
    double price1 = Yarn.price;
    String colour1 = Yarn.colour;

    public Woolen() {
    }

    public Woolen(String brand, int weight1, double price1, String colour1) {
        this.brand = brand;
        this.weight1 = weight1;
        this.price1 = price1;
        this.colour1 = colour1;
    }

    public String printInfo() {
        return "Woolen{" +
                "type='" + type + '\'' +
                ", model='" + brand + '\'' +
                ", weight=" + weight1 +
                ", price=" + price1 +
                ", colour='" + colour1 + '\'' +
                '}';
    }
}
