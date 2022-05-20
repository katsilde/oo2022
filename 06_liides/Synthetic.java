public class Synthetic implements Yarn {
    String type = "Synthetic";
    String brand = Yarn.brandName;
    int weight1 = Yarn.weight;
    double price1 = Yarn.price;
    String colour1 = Yarn.colour;

    public Synthetic() {
    }

    public Synthetic(String brand, int weight1, double price1, String colour1) {
        this.brand = brand;
        this.weight1 = weight1;
        this.price1 = price1;
        this.colour1 = colour1;
    }

    public String printInfo() {
        return "Synthetic{" +
                "type='" + type + '\'' +
                ", model='" + brand + '\'' +
                ", weight=" + weight1 +
                ", price=" + price1 +
                ", colour='" + colour1 + '\'' +
                '}';
    }
}
