package complejidades;

public class ComplejidadLogaritmica {
    public void ejemplo() {
            System.out.println("\n--- Ejemplo O(log n) Logarítmica ---");
            int n = 16; 
            
            for (int i = 1; i <= n; i = i * 2) {
                System.out.println("Valor actual de i: " + i);
            }
        }
}
