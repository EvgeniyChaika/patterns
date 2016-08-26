package patterns.behavioral.command.impl;

import patterns.behavioral.command.Order;
import patterns.behavioral.command.Stock;

/**
 * Created on 26.08.16.
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
