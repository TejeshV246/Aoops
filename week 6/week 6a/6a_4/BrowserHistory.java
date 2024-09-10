import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    // Method to visit a new page
    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    // Method to go back to the previous page
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No previous page to go back to.");
        }
    }

    // Method to go forward to the next page
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No next page to go forward to.");
        }
    }

    // Method to display the current page
    public void displayCurrentPage() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No page is currently open.");
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        
        browserHistory.visit("http://example.com");
        browserHistory.visit("http://example.com/page1");
        browserHistory.visit("http://example.com/page2");

        browserHistory.displayCurrentPage(); // Display the current page
        
        browserHistory.goBack(); // Go back to the previous page
        browserHistory.displayCurrentPage(); // Display the current page

        browserHistory.goForward(); // Go forward to the next page
        browserHistory.displayCurrentPage(); // Display the current page

        browserHistory.goBack(); // Go back again
        browserHistory.visit("http://example.com/newpage"); // Visit a new page
        browserHistory.displayCurrentPage(); // Display the current page
    }
}
