import Contracts.IOrder;
import Core.*;
import Enums.BookType;
import Factories.OrderServiceFactory;
import Services.Order.IOrderService;
import Tests.BookInventory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TestBookCrud(); // done
        TestE_bookOrder(); // done
        TestPaperBookOrder(); // done

    }

    public static void TestBookCrud()
    {
        List<Book> books = new ArrayList<>();
        books.add(new PaperBook(UUID.randomUUID().toString(),
                "The Great Gatsby",
                10.99,
                1925,
                70L));

        books.add(new PaperBook(UUID.randomUUID().toString(),
                "To Kill a Mockingbird",
                8.99,
                1960,
                80L));

        books.add(new PaperBook(UUID.randomUUID().toString(),
                "Java essentials",
                12.99,
                1949,
                90L));
        books.add(new EBook(UUID.randomUUID().toString(),
                "Master C#",
                10.99,
                2020
        ));

        for (Book book : books) {
            BookInventory.AddBook(book);
        }

        BookInventory.GetAllBooks();
        //BookInventory.RemoveBook(books.get(0).getISBN()); done
        BookInventory.GetAllBooks();
    }

    public static void TestE_bookOrder()
    {
        try
        {
            IOrderService orderService = OrderServiceFactory.createOrderService(BookType.ELECTRONIC);
            EBook eBook = (EBook) BookInventory.GetBookByTitle("Master C#");

            IOrder order = new EmailOrder(eBook, "mohamed@gmail.com");
            CheckoutDetails checkoutDetails = orderService.processOrder(order);

            System.out.println(checkoutDetails.toString());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void TestPaperBookOrder()
    {
        try
        {
            IOrderService orderService = OrderServiceFactory.createOrderService(BookType.PAPER);
            PaperBook pBook = (PaperBook) BookInventory.GetBookByTitle("The Great Gatsby");

            IOrder order = new ShippingOrder(pBook, "mohamed@gmail.com");
            CheckoutDetails checkoutDetails = orderService.processOrder(order);

            System.out.println(checkoutDetails.toString());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}