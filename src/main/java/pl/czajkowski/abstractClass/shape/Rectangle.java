package pl.czajkowski.abstractClass.shape;

public class Rectangle extends Shape {

    private double siteA;
    private double siteB;

    @Override
    protected String makeName() {
        String name = "Prostokat (bok A: " + siteA + " bok B: "+ siteB;
        return name;
    }

    public Rectangle(double siteA, double siteB) {
        this.siteA = siteA;
        this.siteB = siteB;
        super.name = makeName();
    }

    @Override
    protected void countArea() {
        super.area = siteA * siteB;
    }

    @Override
    public String toString() {
        return "Dla figury Prostokat" + super.toString();
    }
}
