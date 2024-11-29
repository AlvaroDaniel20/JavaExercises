package Logic_Challenges;

import java.util.HashMap;
import java.util.Map;

public class Palindromos {

    public static boolean puedeSerPalindromo(int numero) {
        String strNumero = Integer.toString(numero);
        
        Map<Character, Integer> frecuencia = new HashMap<>();
        
        for (char c : strNumero.toCharArray()) {
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }
        
        int imparCount = 0;
        for (int count : frecuencia.values()) {
            if (count % 2 != 0) {
                imparCount++;
            }
        }
        
        return imparCount <= 1;
    }

    public static void main(String[] args) {
        System.out.println(puedeSerPalindromo(5));
        System.out.println(puedeSerPalindromo(2121));
        System.out.println(puedeSerPalindromo(1331));
        System.out.println(puedeSerPalindromo(3357665));
        System.out.println(puedeSerPalindromo(1294));
    }
}
