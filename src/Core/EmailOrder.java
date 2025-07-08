package Core;

import Contracts.IEmailable;
import Contracts.IOrder;

public class EmailOrder implements IOrder {

    private EBook book;
    private String email;

    public EmailOrder(EBook book, String email) {
        this.book = book;
        this.email = email;
    }

    public IEmailable getBook() {
        return book;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setBook(EBook book) {
        this.book = book;
    }

    @Override
    public CheckoutDetails getOrderDetails() {

        return new CheckoutDetails(this);
    }

    @Override
    public String toString() {
        return "Email: " + email + "\n" + book.toString();
    }
}
