
public class RideSharingApp {
    public static void main(String[] args) {
        // Singleton: User Authentication
        UserAuth userAuth = UserAuth.getInstance();
        userAuth.login("JohnDoe");

        // Factory Method: Requesting a Vehicle
        VehicleFactory vehicleFactory;
        String requestedVehicle = "Car"; // This could be dynamic, based on user input

        switch (requestedVehicle) {
            case "Car":
                vehicleFactory = new CarFactory();
                break;
            case "Bike":
                vehicleFactory = new BikeFactory();
                break;
            case "Scooter":
                vehicleFactory = new ScooterFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }

        Vehicle vehicle = vehicleFactory.createVehicle();
        System.out.println(vehicle.ride());

        // Abstract Factory: Choosing a Payment Method
        PaymentFactory paymentFactory;
        String selectedPayment = "PayPal"; // This could be dynamic, based on user input

        switch (selectedPayment) {
            case "CreditCard":
                paymentFactory = new CreditCardFactory();
                break;
            case "PayPal":
                paymentFactory = new PayPalFactory();
                break;
            case "Cash":
                paymentFactory = new CashFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method");
        }

        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        System.out.println(paymentMethod.pay());
    }
}
