package coffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coffee espresso = new Coffee("Espresso", 2.50);
        Coffee latte = new Coffee("Latte", 3.50);
        Coffee cappuccino = new Coffee("Cappuccino", 3.00);

        Condiment milk = new Condiment("Milk", 0.50);
        Condiment soy = new Condiment("Soy", 0.60);
        Condiment mocha = new Condiment("Mocha", 0.70);

        System.out.println("Choose a coffee:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        int coffeeChoice = scanner.nextInt();

        Coffee selectedCoffee;
        switch (coffeeChoice) {
            case 1:
                selectedCoffee = espresso;
                break;
            case 2:
                selectedCoffee = latte;
                break;
            case 3:
                selectedCoffee = cappuccino;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Espresso.");
                selectedCoffee = espresso;
        }

        Order order = new Order(selectedCoffee);

        System.out.println("Add condiments (enter 0 to finish):");
        System.out.println("1. Milk - $0.50");
        System.out.println("2. Soy - $0.60");
        System.out.println("3. Mocha - $0.70");

        int condimentChoice;
        do {
            condimentChoice = scanner.nextInt();
            switch (condimentChoice) {
                case 1:
                    order.addCondiment(milk);
                    break;
                case 2:
                    order.addCondiment(soy);
                    break;
                case 3:
                    order.addCondiment(mocha);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (condimentChoice != 0);

        scanner.close();

        order.printOrder();
    }
}

