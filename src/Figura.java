public abstract class Figura implements Comparable<Figura> {

    //Abtract method area
    public abstract double area();

    //Requeriment for sorting condition
    @Override
    public int compareTo(Figura o) {
        return (int)(this.area() - o.area());
    }
}
