package pl.czajkowski.abstractClass.shape;

public class Triangle extends Shape {

    private double base;
    private double height;

    @Override
    protected String makeName() {
        String name = "Trojkat (podstawa: " + base + " wysokosc: " + height;
        return name;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        super.name = makeName();
    }

    @Override
    protected void countArea() {
        super.area = base * height / 2;
    }

}
