package Taller_Practico_Logica_de_Programacion;

import java.util.Scanner;

public class Ejercicio5AreaPoligono {
    public static double calcularArea(String poligono, double... dimensiones) {
        double area = 0;

        if (poligono.equalsIgnoreCase("triangulo")) {
            if (dimensiones.length == 2) {
                area = (dimensiones[0] * dimensiones[1]) / 2;
            } else {
                System.out.println("Error: El triángulo necesita base y altura.");
            }
        } else if (poligono.equalsIgnoreCase("cuadrado")) {
            if (dimensiones.length == 1) {
                area = dimensiones[0] * dimensiones[0];
            } else {
                System.out.println("Error: El cuadrado necesita solo un lado.");
            }
        } else if (poligono.equalsIgnoreCase("rectangulo")) {
            if (dimensiones.length == 2) {
                area = dimensiones[0] * dimensiones[1];
            } else {
                System.out.println("Error: El rectángulo necesita base y altura.");
            }
        } else {
            System.out.println("Error: Polígono no reconocido.");
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de polígono (triangulo, cuadrado, rectangulo): ");
        String poligono = scanner.nextLine().toLowerCase();

        double[] dimensiones = new double[2];
        double area = 0;

        if (poligono.equals("triangulo") || poligono.equals("rectangulo")) {
            System.out.print("Ingrese la base: ");
            dimensiones[0] = scanner.nextDouble();
            System.out.print("Ingrese la altura: ");
            dimensiones[1] = scanner.nextDouble();
            area = calcularArea(poligono, dimensiones[0], dimensiones[1]);
        } else if (poligono.equals("cuadrado")) {
            System.out.print("Ingrese el lado: ");
            dimensiones[0] = scanner.nextDouble();
            area = calcularArea(poligono, dimensiones[0]);
        } else {
            System.out.println("Polígono no válido.");
        }

        if (area != 0) {
            System.out.println("El área del " + poligono + " es: " + area);
        }

        scanner.close();
    }
}
