package patterns.structural.flyweight;

import patterns.structural.flyweight.impl.Circle;

import java.util.HashMap;

/**
 * Created on 25.08.16.
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle with color : " + color);
        }
        return circle;
    }

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomRadius() {
        return (int) (Math.random() * 100);
    }
}
