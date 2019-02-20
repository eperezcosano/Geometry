public class Main {
    public static void main(String[] args) {

        //Print my first "Hello World!"
        System.out.println("Hello World!");

        //Create some shapes for testing
        Triangle t = new Triangle(2, 3);
        Rectangle r = new Rectangle(3, 4);
        Cercle c = new Cercle(3);
        Quadrat q = new Quadrat(2);

        //Put all of them in a array
        Figura[] f = new Figura[5];
        f[0] = t;
        f[1] = r;
        f[2] = t;
        f[3] = c;
        f[4] = q;

        //Sum all the areas of the array
        double suma = GestorFigures.suma(f);
        System.out.println(suma);

        //Sort the array by the shape's area
        GestorFigures.sort(f);
        for (Figura l: f) {
            System.out.println(l.getClass().getName() + " " + l.area());
        }
    }
}
