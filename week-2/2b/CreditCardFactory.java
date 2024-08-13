// CreditCardFactory.java
public class CreditCardFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}
