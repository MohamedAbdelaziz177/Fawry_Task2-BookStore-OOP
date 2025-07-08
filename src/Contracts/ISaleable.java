package Contracts;

public interface ISaleable {

    String getTitle();
    String getISBN();
    Double getPrice();
    int getYear();

    void setTitle(String title);
    void setISBN(String ISBN);
    void setPrice(Double price);
    void setYear(int year);

}
