public class Cercle extends Figura {
    public double r;

    public Cercle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
}
