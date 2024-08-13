import java.util.ArrayList;
import java.util.List;

public interface AuctionSubject {
    void attach(Bidder observer);
    void detach(Bidder observer);
    void notifyObservers(String event);
}
