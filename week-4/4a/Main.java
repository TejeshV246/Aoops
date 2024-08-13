public class Main {
    public static void main(String[] args) {
        // Create an auction for an item
        Auction auction = new Auction("Vintage Watch");

        // Create bidders
        ConcreteBidder bidder1 = new ConcreteBidder("Alice");
        ConcreteBidder bidder2 = new ConcreteBidder("Bob");

        // Subscribe bidders to the auction
        auction.attach(bidder1);
        auction.attach(bidder2);

        // Notify bidders about item availability
        auction.makeItemAvailable();

        // Start the bidding process
        auction.startBidding();

        // End the bidding process
        auction.endBidding();
    }
}
