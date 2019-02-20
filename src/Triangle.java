public class Triangle extends Figura {

    //Atributes
    public double b;
    public double h;

    //Constructor
    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    //Method area from the abstract class Figura
    @Override
    public double area() {
        return (this.b * this.h) / 2;
    }
}
