package Estructuras_de_control;

import java.util.Scanner;

public class Ejercicio4EDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            int i = 1;
            
            while (i <= numero) {
                factorial *= i;
                i++;
            }
            
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        
        scanner.close();
    }
}
