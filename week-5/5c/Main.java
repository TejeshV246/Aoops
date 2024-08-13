public class Main {
    public static void main(String[] args) {
        // Initialize the library
        Library library = new Library();
        
        // Create members
        Member member1 = new Member("M001", "John Doe", "john.doe@example.com", "123-456-7890");
        Member member2 = new Member("M002", "Jane Smith", "jane.smith@example.com", "098-765-4321");
        
        // Add members to the library
        library.addMember(member1);
        library.addMember(member2);

        // Create books
        Book ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 2018, "PDF");
        Book printedBook = new PrintedBook("978-0132350884", "Clean Code", "Robert C. Martin", 2008, "Shelf A3", 464);
        
        // Add books to the library
        library.addBook(ebook);
        library.addBook(printedBook);

        // Create notification service
        NotificationService emailService = new EmailNotificationService();

        // Create borrowing service
        BorrowingService borrowingService = new BorrowingService(emailService);

        // Borrow and return books
        borrowingService.borrowBook(ebook, member1);
        borrowingService.returnBook(ebook, member1);

        borrowingService.borrowBook(printedBook, member2);
        borrowingService.returnBook(printedBook, member2);
    }
}
