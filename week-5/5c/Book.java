public interface Book {
    String getISBN();
    String getTitle();
    String getAuthor();
    int getPublicationYear();
    boolean isBorrowed();
    void borrow(Member member);
    void returnBook(Member member);
}
