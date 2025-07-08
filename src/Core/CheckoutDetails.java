package Core;

import java.util.Date;

public class CheckoutDetails {

    private String ISBN;
    private String title;
    private Double price;
    private String customerName = "Mohamed";
    private String OrderType;
    private String message;
    private Date date = new Date();


    public CheckoutDetails(EmailOrder order)
    {
        this.ISBN = order.getBook().getISBN();
        this.title = order.getBook().getTitle();
        this.price = order.getBook().getPrice();
        this.OrderType = "Email";
        this.message = "Order will be sent to: " + order.getEmail();
    }

    public CheckoutDetails(ShippingOrder order)
    {
        this.ISBN = order.getPaperBook().getISBN();
        this.title = order.getPaperBook().getTitle();
        this.price = order.getPaperBook().getPrice();
        this.OrderType = "Shipping";
        this.message = "Order will be shipped to: " + order.getAddress();
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
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getOrderType() {
        return OrderType;
    }
    public void setOrderType(String orderType) {
        this.OrderType = orderType;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "CHECKOUT DETAILS:\n" +
        "[\n" +
        "ISBN=" + ISBN + ",\n" +
                "title=" + title + ",\n" +
                "price=" + price + ",\n" +
                "customerName=" + customerName + ",\n" +
                "OrderType=" + OrderType + ",\n" +
                "message=" + message + ",\n" +
                "date=" + date + ",\n"
                + "]";
    }

}
