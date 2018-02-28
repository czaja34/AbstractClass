package pl.czajkowski.abstractClass.util;

import pl.czajkowski.abstractClass.shape.Circle;
import pl.czajkowski.abstractClass.shape.Rectangle;
import pl.czajkowski.abstractClass.shape.Shape;
import pl.czajkowski.abstractClass.shape.Triangle;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {


        //'Shape' is abstract cannot be instantiated
        // Shape shape = new Shape();


        //'area' has protected acces in 'pl.czajkowski.abstractClass.shape.Shape'
        //shape.area;

        Triangle trianggle= new Triangle(3,3);


        List<Shape> shapeList = new ArrayList<Shape>();

        shapeList.add(new Triangle(3, 5));
        shapeList.add(new Rectangle(5, 6));
        shapeList.add(new Circle(2));


        for (Shape shape : shapeList) {
            System.out.println(shape.toString());
        }

    }

}
