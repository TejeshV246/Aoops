package coffee;

public class Condiment {
    private String name;
    private double price;

    public Condiment(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
