public class BorrowingService {
    private NotificationService notificationService;

    public BorrowingService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void borrowBook(Book book, Member member) {
        if (!book.isBorrowed()) {
            book.borrow(member);
            member.borrowBook(book);
            notificationService.notify(member, "You have borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book " + book.getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(Book book, Member member) {
        if (book.isBorrowed()) {
            book.returnBook(member);
            member.returnBook(book);
            notificationService.notify(member, "You have returned the book: " + book.getTitle());
        } else {
            System.out.println("The book " + book.getTitle() + " was not borrowed.");
        }
    }
}
