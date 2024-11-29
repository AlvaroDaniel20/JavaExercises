import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int [5];
        int suma = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingrese los numeros: ");
            numbers[i] = sc.nextInt();
            suma += numbers[i];
        }

        double promedio = suma / (double) numbers.length;

        System.out.println("El promedio es: " + promedio);
        
    sc.close();
    }   
}