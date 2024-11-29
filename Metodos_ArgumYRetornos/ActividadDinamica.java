package Metodos_ArgumYRetornos;

public class ActividadDinamica {
    
    public static int obtenerMaximo(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("El número más grande es: " + obtenerMaximo(10, 20, 15));
        System.out.println("El número más grande es: " + obtenerMaximo(5, 3, 8));
        System.out.println("El número más grande es: " + obtenerMaximo(7, 7, 7));
    }
}
