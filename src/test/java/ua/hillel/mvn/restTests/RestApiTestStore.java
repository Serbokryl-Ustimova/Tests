package ua.hillel.mvn.restTests;

import org.testng.annotations.Test;
import ua.hillel.rest.Order;
import ua.hillel.rest.RestCreateOrder;

import java.io.IOException;

public class RestApiTestStore {
    @Test
    public void restApiRequests() throws IOException {
        Order order = new Order();
        order.setId(3);
        order.setQuantity(4);
        order.setPetId(3);
        order.setComplete(true);
        order.setStatus("placed");
        order.setShipDate("25.25.2022");

        RestCreateOrder restCreateOrder = new RestCreateOrder();
        restCreateOrder.creteOrder(order);

        Order order1 = new RestCreateOrder().getOrderById(3);
        Order order2 = new RestCreateOrder().deleteOrderById(3);
        Order order3 = new RestCreateOrder().getInventory();

    }

}
