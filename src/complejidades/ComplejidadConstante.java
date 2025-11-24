package complejidades;

public class ComplejidadConstante {
    public void ejemplo() {
        System.out.println("--- Ejemplo O(1) Constante ---");
        
        int x = 10;
        int y = 20;
        int suma = x + y;
        
        System.out.println("La suma es: " + suma);
        System.out.println("Esta operación tarda lo mismo aunque los números sean enormes.");
    }
}
