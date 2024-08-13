// CreditCard.java
public class CreditCard extends PaymentMethod {
    @Override
    public String pay() {
        return "Paid with Credit Card!";
    }
}
