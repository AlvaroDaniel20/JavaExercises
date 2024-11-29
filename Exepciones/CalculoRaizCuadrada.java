package Exepciones;

import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class CalculoRaizCuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su raíz cuadrada: ");
        double numero = scanner.nextDouble();

        try {
            if (numero < 0) {
                throw new NumeroNegativoException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            }

            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
