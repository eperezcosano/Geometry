import java.util.Arrays;
public interface GestorFigures {
    static double suma(Figura [] l) {
        double s = 0;
        for (Figura f: l) {
            s += f.area();
        }
        return s;
    }
    static void sort(Figura[] l) {
        Arrays.sort(l);
    }
}
