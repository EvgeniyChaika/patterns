package patterns.behavioral;

import patterns.behavioral.iterator.Iterator;
import patterns.behavioral.iterator.impl.NameRepository;

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

//        Stock abcStock = new Stock();
//
//        BuyStock buyStock = new BuyStock(abcStock);
//        SellStock sellStock = new SellStock(abcStock);
//
//        Broker broker = new Broker();
//
//        broker.takeOrder(buyStock);
//        broker.takeOrder(sellStock);
//        broker.placeOrders();

//------------------------------------------ Interpreter -----------------------------------------------------

//        Expression isMale = CheckExpression.getMaleExpression();
//        Expression isMarriedWoman = CheckExpression.getMarriedWomanExpression();
//
//        System.out.println("John is male? " + isMale.interpret("John"));
//        System.out.println("Julia is married woman? " + isMarriedWoman.interpret("Married Julia"));

//--------------------------------------------- Iterator -----------------------------------------------------

        NameRepository namesRepository = new NameRepository();

        for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
