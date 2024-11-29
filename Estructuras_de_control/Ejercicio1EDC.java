package Estructuras_de_control;

import java.util.Scanner;

public class Ejercicio1EDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero 1 es el mayor: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero 2 es el mayor: " + num2);
        } else {
            System.out.println("El numero 3 es el mayor: " + num3);
        }
        
        scanner.close();
    }
}
