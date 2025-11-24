package complejidades;

public class ComplejidadCuadratica {
    public void ejemplo() {
            System.out.println("\n--- Ejemplo O(n^2) Cuadrática ---");
            int n = 3; 
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("i: " + i + ", j: " + j);
                }
            }
            System.out.println("Total de operaciones: " + (n * n));
        }
}
