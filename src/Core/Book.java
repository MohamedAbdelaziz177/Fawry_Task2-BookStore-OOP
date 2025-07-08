package Core;

import java.util.Date;

public abstract class Book {

    private String ISBN;
    private String title;
    public Double price;
    private int year;


    public Book(String ISBN, String title, Double price, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}
