package Core;

import Contracts.IEmailable;

public class EBook extends Book implements IEmailable {


    public EBook(String ISBN, String title, Double price, int year)
    {
        super(ISBN, title, price, year);
    }

    @Override
    public String toString() {
        return "EBook\n" +
                "[\n" +
                "ISBN=" + this.getISBN() + ",\n" +
                "title=" + this.getTitle() + ",\n" +
                "price=" + this.getPrice() + ",\n" +
                "year=" + this.getYear() + ",\n" +
                "]";
    }

}
