import complejidades.ComplejidadConstante;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNLogN;

public class App {
    public static void main(String[] args) throws Exception {
        new ComplejidadConstante().ejemplo();
        new ComplejidadLineal().ejemplo();
        new ComplejidadCuadratica().ejemplo();
        new ComplejidadLogaritmica().ejemplo();
        new ComplejidadNLogN().ejemplo();
    }
}
