package Core;

import Contracts.IShippable;

public class PaperBook extends Book implements IShippable {

    private Long stock;

    public PaperBook(String ISBN, String title, Double price, int year, Long stock)
    {
        super(ISBN, title, price, year);
        this.stock = stock;
    }


    @Override
    public Long getStock() {
        return this.stock;
    }

    @Override
    public void setStock(Long stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "EBook,\n" +
                "[\n" +
                "ISBN=" + this.getISBN() + ",\n" +
                "title=" + this.getTitle() + ",\n" +
                "price=" + this.getPrice() + ",\n" +
                "quantity=" + this.getStock() + ",\n" +
                "year=" + this.getYear() + ",\n" +
                "]";
    }
}
