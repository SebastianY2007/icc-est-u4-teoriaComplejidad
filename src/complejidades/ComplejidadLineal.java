package complejidades;

public class ComplejidadLineal {
    public void ejemplo() {
        System.out.println("--- Ejemplo O(n) Lineal ---");
        
        int n = 5; 
        
        for (int i = 0; i < n; i++) {
            System.out.println("Iteración " + (i + 1));
        }
        
        System.out.println("Si n se duplica, el número de operaciones también se duplica.");
    }
}
