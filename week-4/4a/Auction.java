import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionSubject {
    private List<Bidder> bidders = new ArrayList<>();
    private String itemName;
    private boolean isBiddingStarted = false;
    private boolean isBiddingEnded = false;

    public Auction(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void attach(Bidder observer) {
        bidders.add(observer);
    }

    @Override
    public void detach(Bidder observer) {
        bidders.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Bidder bidder : bidders) {
            bidder.update(event);
        }
    }

    public void startBidding() {
        if (!isBiddingStarted && !isBiddingEnded) {
            isBiddingStarted = true;
            notifyObservers("Bidding has started for item: " + itemName);
        }
    }

    public void endBidding() {
        if (isBiddingStarted && !isBiddingEnded) {
            isBiddingEnded = true;
            notifyObservers("Bidding has ended for item: " + itemName);
        }
    }

    public void makeItemAvailable() {
        notifyObservers("Item " + itemName + " is now available for bidding.");
    }
}
