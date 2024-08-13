public class PrintedBook implements Book {
    private String ISBN;
    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;
    private String shelfLocation;
    private int pageCount;

    public PrintedBook(String ISBN, String title, String author, int publicationYear, String shelfLocation, int pageCount) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
        this.shelfLocation = shelfLocation;
        this.pageCount = pageCount;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void borrow(Member member) {
        if (!borrowed) {
            borrowed = true;
            System.out.println(member.getName() + " borrowed the printed book: " + title);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnBook(Member member) {
        if (borrowed) {
            borrowed = false;
            System.out.println(member.getName() + " returned the printed book: " + title);
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public int getPageCount() {
        return pageCount;
    }
}
