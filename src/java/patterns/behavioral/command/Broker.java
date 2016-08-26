package patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 26.08.16.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
