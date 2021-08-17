package creational.prototype;

import creational.prototype.shapes.Circle;
import creational.prototype.shapes.Rectangle;
import creational.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle(10, 20, "red", 15);
        shapes.add(circle);

        Circle anotherCircle = circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle(5, 10, "blue", 10, 20);
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);

        PrototypeFactory.getInstance().put("first-circle", circle);
        PrototypeFactory.getInstance().put("second-circle", anotherCircle);
        PrototypeFactory.getInstance().put("first-rectangle", rectangle);

        // false
        System.out.println(PrototypeFactory.getInstance().get("first-circle") == circle);

        // true
        System.out.println(PrototypeFactory.getInstance().get("first-circle").equals(circle));

    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
