package patterns.creational;

/**
 * Created on 17.08.16.
 */
public class StartCreational {

//    public static void main(String[] args) {

//------------------------------------------ FactoryMethod ---------------------------------------------------------

//        ShapeFactory shapeFactory = new ShapeFactory();
//
//        Shape shape1 = shapeFactory.getShape(TypeShape.RECTANGLE);
//        shape1.draw();
//
//        Shape shape2 = shapeFactory.getShape(TypeShape.SQUARE);
//        shape2.draw();
//
//        Shape shape3 = shapeFactory.getShape(TypeShape.CIRCLE);
//        shape3.draw();

//----------------------------------------- AbstractMethod ---------------------------------------------------------

//        AbstractFactory factory1 = FactoryProducer.getFactory(TypeFactory.SHAPE);
//
//        Shape shape1 = factory1.getShape(TypeShape.RECTANGLE);
//        shape1.draw();
//
//        Shape shape2 = factory1.getShape(TypeShape.CIRCLE);
//        shape2.draw();
//
//        Shape shape3 = factory1.getShape(TypeShape.SQUARE);
//        shape3.draw();
//
//        AbstractFactory factory2 = FactoryProducer.getFactory(TypeFactory.COLOR);
//
//        Color color1 = factory2.getColor(TypeColor.BLUE);
//        color1.fill();
//
//        Color color2 = factory2.getColor(TypeColor.GREEN);
//        color2.fill();
//
//        Color color3 = factory2.getColor(TypeColor.RED);
//        color3.fill();

//--------------------------------------------- Singleton ----------------------------------------------------------

//        SingleObject.getInstance().showMessage();
//        SingleObject.getInstance().showMessage();
//        SingleObject.getInstance().showMessage();
//        SingleObject.getInstance().showMessage();

//---------------------------------------------- Builder -----------------------------------------------------------

//        MealBuilder mealBuilder = new MealBuilder();
//
//        Meal vegMeal = mealBuilder.prepareVegMeal();
//
//        System.out.println("Veg Meal");
//        vegMeal.showItems();
//        System.out.println("Total Cost: " + vegMeal.getCost());
//
//        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
//
//        System.out.println("\nNon-Veg Meal");
//        nonVegMeal.showItems();
//        System.out.println("Total Cost: " + nonVegMeal.getCost());

//----------------------------------------------- Prototype --------------------------------------------------------

//        ShapeCache.loadCache();
//
//        Shape clonedShape = (Shape) ShapeCache.getShape("1");
//        System.out.println("Shape : " + clonedShape.getType());
//
//        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
//        System.out.println("Shape : " + clonedShape2.getType());
//
//        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
//        System.out.println("Shape : " + clonedShape3.getType());
//    }
}
