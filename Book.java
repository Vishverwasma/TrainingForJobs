package Railworld.Day08;

public class Book {
    private String title;
    private String author;
    private int Number_of_Pages;

    public Book() {
    }

    public Book(String title, String author, int number_of_Pages) {
        this.title = title;
        this.author = author;
        Number_of_Pages = number_of_Pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber_of_Pages() {
        return Number_of_Pages;
    }

    public void setNumber_of_Pages(int number_of_Pages) {
        Number_of_Pages = number_of_Pages;
    }

    public String get_short_summary() {
        return "Book title='" + title +", author='" + author +", Number_of_Pages=" + Number_of_Pages;
    }
}
