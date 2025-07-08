package Core;

import Contracts.IOrder;

public class ShippingOrder implements IOrder {

    private PaperBook paperBook;
    private String address;

    public ShippingOrder(PaperBook paperBook, String address) {
        this.paperBook = paperBook;
        this.address = address;
    }

    public PaperBook getPaperBook() {
        return paperBook;
    }
    public void setPaperBook(PaperBook paperBook) {
        this.paperBook = paperBook;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public CheckoutDetails getOrderDetails() {
        return new CheckoutDetails(this);
    }
}
