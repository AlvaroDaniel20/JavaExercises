package Exepciones;

import java.util.ArrayList;
import java.util.List;

public class GestionDeListas {
    
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        
        System.out.println("Lista inicial: " + lista);
        
        try {
            System.out.println("Elemento en el índice 2: " + lista.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }
        
        try {
            System.out.println("Elemento en el índice 10: " + lista.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }
        
        try {
            lista.remove(1);
            System.out.println("Lista después de eliminar el elemento en índice 1: " + lista);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: No se pudo eliminar el elemento en el índice proporcionado.");
        }

        try {
            lista.remove(10);
            System.out.println("Lista después del intento de eliminar el elemento en índice 10: " + lista);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }

        System.out.println("Lista final: " + lista);
    }
}
