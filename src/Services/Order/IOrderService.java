package Services.Order;

import Contracts.IOrder;
import Core.CheckoutDetails;

public interface IOrderService {


    CheckoutDetails processOrder(IOrder order);
}
