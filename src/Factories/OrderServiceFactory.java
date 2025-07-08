package Factories;

import Enums.BookType;
import Services.Email.EmailService;
import Services.Email.IEmailService;
import Services.Order.EbookOrderService;
import Services.Order.IOrderService;
import Services.Order.PaperBookOrderService;

public class OrderServiceFactory {

    public static IOrderService createOrderService(BookType orderType) throws IllegalArgumentException
    {
        if(orderType == BookType.ELECTRONIC)
        {
            IEmailService mailService = new EmailService();
            return new EbookOrderService(mailService);
        }
        else if(orderType == BookType.PAPER)
            return new PaperBookOrderService();
        else
            throw new IllegalArgumentException("Invalid order type");
    }
}
