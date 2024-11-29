import java.util.Scanner;

public class PromedioDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double suma = 0;
        
        System.out.println("Por favor, ingrese 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];
        }
        
        double promedio = suma / numeros.length;
        
        System.out.println("El promedio de los números ingresados es: " + promedio);
        
        scanner.close();
    }
}
