import java.util.Arrays;
public class GestorFigures {
    public static double suma(Figura[] l) {
        double s = 0;
        for (Figura f: l) {
            s += f.area();
        }
        return s;
    }
    public static void sort(Figura[] l) {
        Arrays.sort(l);
    }
}
