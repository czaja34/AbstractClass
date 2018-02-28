package pl.czajkowski.abstractClass.shape;

public abstract class Shape {

    // zmienna musi byc protected by była widziana w klasach dziedziczonych ale nie moze byc uzyta po przez instancje klasy
    //double area;
    protected double area;
    protected String name;

    protected abstract String makeName();

    //metoda NIE abstakcyjna jest w tedy kiedy ma "ciało"
    public double getArea() {
        if (area == 0) {
            countArea();
        }
        return area;
    }


    //metoda ABSTRAKCYJNA, musi być nadpisana w klasach rozszerzajacych/dziedziczacych
    protected abstract void countArea();


    //metoda NIE abstrakcyjna, mozna ale nie trzeba nadpisywaćc
    public String toString() {
        if (area == 0) {
            getArea();
        }
        return "Dla figury " + name + ") pole wynosi: " + area;
    }
}
