package Services.Order;

import Contracts.IOrder;
import Services.Email.IEmailService;
import Core.CheckoutDetails;

public class EbookOrderService implements IOrderService{

    private IEmailService emailService;

    public EbookOrderService(IEmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public CheckoutDetails processOrder(IOrder order) {

        System.out.println();
        System.out.println("Starting Order Processing");
        System.out.println("----------------");
        CheckoutDetails details = order.getOrderDetails();
        emailService.sendEmail("ex@gmail.com", "mohaamed@gmail.com", details.toString());
        return details;
    }
}
