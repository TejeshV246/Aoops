public class Ticket {
    private static int idCounter = 1;
    private int ticketId;
    private String customerName;
    private String issueDescription;

    public Ticket(String customerName, String issueDescription) {
        this.ticketId = idCounter++;
        this.customerName = customerName;
        this.issueDescription = issueDescription;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + ", Customer: " + customerName + ", Issue: " + issueDescription;
    }
}
