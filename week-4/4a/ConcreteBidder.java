public class ConcreteBidder implements Bidder {
    private String name;

    public ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " received notification: " + event);
    }
}
