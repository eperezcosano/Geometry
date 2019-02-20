import java.util.Arrays;

public interface GestorFigures {

    //Return the sum of all shapes areas given an array of Figura
    static double suma(Figura [] l) {
        double s = 0;
        for (Figura f: l) {
            s += f.area();
        }
        return s;
    }

    //Sort an array of Figura by its areas
    static void sort(Figura[] l) {
        Arrays.sort(l);
    }
}
