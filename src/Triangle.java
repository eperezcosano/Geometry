public class Triangle extends Figura {
    public double b;
    public double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return (b * h) / 2;
    }
}
