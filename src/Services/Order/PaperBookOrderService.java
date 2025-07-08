package Services.Order;

import Contracts.IOrder;
import Core.CheckoutDetails;

public class PaperBookOrderService implements IOrderService{

    @Override
    public CheckoutDetails processOrder(IOrder order) {
        CheckoutDetails details = order.getOrderDetails();
        /* Save it -- do processing */
        return details;
    }
}
