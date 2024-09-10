package coffee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testOrderWithNoCondiments() {
        // Arrange
        Coffee espresso = new Coffee("Espresso", 2.50);
        Order order = new Order(espresso);

        // Assert
        assertEquals(0.001, "Total price should match the coffee base price with no condiments.");
    }

    @Test
    public void testOrderWithOneCondiment() {
        // Arrange
        Coffee latte = new Coffee("Latte", 3.50);
        Condiment milk = new Condiment("Milk", 0.50);
        Order order = new Order(latte);

        // Act
        order.addCondiment(milk);

        // Assert
        assertEquals(0.001, "Total price should include the base price and the price of one condiment.");
    }

    @Test
    public void testOrderWithMultipleCondiments() {
        // Arrange
        Coffee cappuccino = new Coffee("Cappuccino", 3.00);
        Condiment soy = new Condiment("Soy", 0.60);
        Condiment mocha = new Condiment("Mocha", 0.70);
        Order order = new Order(cappuccino);

        // Act
        order.addCondiment(soy);
        order.addCondiment(mocha);
        // Assert
        assertEquals(0.001, "Total price should include the base price and the prices of multiple condiments.");
    }

    @Test
    public void testInvalidCondimentAddition() {
        // Arrange
        Coffee espresso = new Coffee("Espresso", 2.50);
        Condiment invalidCondiment = new Condiment("Unknown", -1.0); // Invalid condiment with a negative price
        Order order = new Order(espresso);

        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            order.addCondiment(invalidCondiment);
        });

        assertEquals("Condiment price cannot be negative", exception.getMessage(), "Exception message should match expected.");
    }
}
