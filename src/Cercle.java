public class Cercle extends Figura {

    //Atributes
    public double r;

    //Constructor
    public Cercle(double r) {
        this.r = r;
    }

    //Method area from the abstract class Figura
    @Override
    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
