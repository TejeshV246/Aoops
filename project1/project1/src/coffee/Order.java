package coffee;

public class Order {
    private Coffee coffee;
    private double totalPrice;

    public Order(Coffee coffee) {
        this.coffee = coffee;
        this.totalPrice = coffee.getBasePrice();
    }

    public void addCondiment(Condiment condiment) {
        totalPrice += condiment.getPrice();
        System.out.println("Added: " + condiment.getName() + " - $" + condiment.getPrice());
    }

    public void printOrder() {
        System.out.println("Order Details:");
        System.out.println("Coffee: " + coffee.getName() + " - $" + coffee.getBasePrice());
        System.out.println("Total Price: $" + totalPrice);
    }
}
