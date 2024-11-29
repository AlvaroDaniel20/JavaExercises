package Taller_Practico_Logica_de_Programacion;

public class Ejercicio3LaSDFibonacci {
    public static void main(String[] args) {
        int limite = 50;
        long anterior = 0;
        long actual = 1;

        System.out.println("Los primeros " + limite + " números de Fibonacci son:");
        System.out.print(anterior + ", " + actual);

        for (int i = 3; i <= limite; i++) {
            long siguiente = anterior + actual;
            System.out.print(", " + siguiente);
            anterior = actual;
            actual = siguiente;
        }
        System.out.println();
    }
}
