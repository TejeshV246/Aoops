// PayPalFactory.java
public class PayPalFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}
