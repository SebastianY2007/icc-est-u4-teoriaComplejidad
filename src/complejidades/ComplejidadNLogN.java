package complejidades;

public class ComplejidadNLogN {
    public void ejemplo() {
            System.out.println("\n--- Ejemplo O(n log n) ---");
            int n = 8;
            
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j = j * 2) {
                    System.out.println("i: " + i + ", j: " + j);
                }
            }
        }
}
