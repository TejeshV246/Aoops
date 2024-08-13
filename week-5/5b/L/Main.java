public class Main {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly();

        Bird myOstrich = new Ostrich();
        try {
            myOstrich.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
