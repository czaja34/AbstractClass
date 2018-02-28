package pl.czajkowski.abstractClass.shape;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Circle extends Shape {

    private double ray;

    public Circle(double ray) {
        this.ray = ray;
        super.name = makeName();
    }

    @Override
    protected String makeName() {
        String name = "Kolo (promien " + ray;
        return name;
    }

    @Override
    protected void countArea() {
        super.area = PI * sqrt(ray);
    }

    @Override
    public String toString() {
        return "Dla figury Kolo " + super.toString();
    }
}
