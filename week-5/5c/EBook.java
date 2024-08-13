public class EBook implements Book {
    private String ISBN;
    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;
    private String fileFormat;

    public EBook(String ISBN, String title, String author, int publicationYear, String fileFormat) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
        this.fileFormat = fileFormat;
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
            System.out.println(member.getName() + " borrowed the eBook: " + title);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnBook(Member member) {
        if (borrowed) {
            borrowed = false;
            System.out.println(member.getName() + " returned the eBook: " + title);
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public String getFileFormat() {
        return fileFormat;
    }
}
