package Taller_Practico_Logica_de_Programacion;

public class Ejercicio2Anagrama {
    public static boolean esAnagrama(String palabra1, String palabra2) {
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        if (palabra1.equals(palabra2)) {
            return false;
        }

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        for (int i = 0; i < palabra1.length(); i++) {
            char letra = palabra1.charAt(i);
            int cuentaEnPalabra1 = contarOcurrencias(palabra1, letra);
            int cuentaEnPalabra2 = contarOcurrencias(palabra2, letra);

            if (cuentaEnPalabra1 != cuentaEnPalabra2) {
                return false;
            }
        }

        return true;
    }

    public static int contarOcurrencias(String palabra, char caracter) {
        int cuenta = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == caracter) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public static void main(String[] args) {
        String palabra1 = "Amor";
        String palabra2 = "Roma";

        if (esAnagrama(palabra1, palabra2)) {
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas.");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas.");
        }
    }
}
