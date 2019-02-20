public class Rectangle extends Figura {

    //Atributes
    public double l1;
    public double l2;

    //Constructor
    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    //Method area from the abstract class Figura
    @Override
    public double area() {
        return this.l1 * this.l2;
    }
}
