package Exepciones;

import java.util.Scanner;

public class DivisionporCero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (dividendo): ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número (divisor): ");
        int numero2 = scanner.nextInt();

        try {
            if (numero2 == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
