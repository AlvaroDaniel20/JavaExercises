package Estructuras_de_control;

import java.util.Scanner;

public class Ejercicio2EDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                pares++;
                System.out.println(i);
            }
        }

        System.out.println("Hay " + pares + " números pares entre 1 y 100.");

        scanner.close();
    }
}
