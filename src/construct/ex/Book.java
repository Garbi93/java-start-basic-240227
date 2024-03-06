package construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    // 생성자 오버로딩 및 this
    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // 메서드 작성
    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
