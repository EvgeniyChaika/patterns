package patterns.behavioral;

import patterns.behavioral.command.Broker;
import patterns.behavioral.command.Stock;
import patterns.behavioral.command.impl.BuyStock;
import patterns.behavioral.command.impl.SellStock;

/**
 * Created on 25.08.16.
 */
public class StartBehavioral {

    public static void main(String[] args) {

//------------------------------------ Chain of responsibility -----------------------------------------------

//        AbstractLogger loggerChain = LoggerFactory.getChainOfLoggers();
//        loggerChain.logMessage(AbstractLogger.INFO,
//                "This is an information.");
//        System.out.println("");
//        loggerChain.logMessage(AbstractLogger.DEBUG,
//                "This is a debug level information.");
//        System.out.println("");
//        loggerChain.logMessage(AbstractLogger.ERROR,
//                "This is an error information.");


//-------------------------------------------- Command -------------------------------------------------------

        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();

        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}