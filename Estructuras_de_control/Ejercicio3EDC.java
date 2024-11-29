package Estructuras_de_control;

import java.util.Scanner;

public class Ejercicio3EDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENÚ DE OPERACIONES");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
            
        int opcion = scanner.nextInt();
            
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer número: ");
                double num1Suma = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double num2Suma = scanner.nextDouble();
                System.out.println("Resultado: " + (num1Suma + num2Suma));
                break;
            case 2:
                System.out.println("Ingrese el primer número: ");
                double num1Resta = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double num2Resta = scanner.nextDouble();
                System.out.println("Resultado: " + (num1Resta - num2Resta));
                break;
            case 3:
                System.out.println("Ingrese el primer número: ");
                double num1Multiplicacion = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double num2Multiplicacion = scanner.nextDouble();
                System.out.println("Resultado: " + (num1Multiplicacion * num2Multiplicacion));
                break;
            case 4:
                System.out.println("Ingrese el primer número: ");
                double num1Division = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double num2Division = scanner.nextDouble();
                if (num2Division != 0) {
                    System.out.println("Resultado: " + (num1Division / num2Division));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        
        scanner.close();
    }
}
