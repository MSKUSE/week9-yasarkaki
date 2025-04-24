import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class TestAbstractShapes {


    public static void main(String[] args) {
        Shape rectangle = new Rectangle(sideA:3,sideB:4);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(sideA:3,sideB:4);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);

        Shape square = new Rectangle(sideA:3 ; sideB:3);
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println(square);

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(rectangle);
        shapes.add(rectangle1);
        shapes.add(square);

        for (int i = 0; i < 3 ; i++){
            System.out.println(shapes.get(i));
        }

    }


}
