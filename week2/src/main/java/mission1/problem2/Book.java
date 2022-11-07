package mission1.problem2;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 책정보 수정
    public void editBook(String title, String author) {
        setTitle(title);
        setAuthor(author);
    }
}
