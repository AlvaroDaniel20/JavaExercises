package Logic_Challenges;

public class LetrasPorNumeros {
    public static String convertir(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String cleanedStr = limpiarCadena(input.toLowerCase());

        StringBuilder resultado = new StringBuilder();
        boolean primerNumero = true;

        for (char c : cleanedStr.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!primerNumero) {
                    resultado.append(" ");
                }
                resultado.append(c - 'a' + 1);
                primerNumero = false;
            }
        }

        return resultado.toString();
    }

    private static String limpiarCadena(String str) {
        str = str.replaceAll("[áàäâã]", "a")
                .replaceAll("[éèëê]", "e")
                .replaceAll("[íìïî]", "i")
                .replaceAll("[óòöôõ]", "o")
                .replaceAll("[úùüû]", "u")
                .replaceAll("[ý]", "y")
                .replaceAll("[ñ]", "n");

        str = str.replaceAll("[^a-z ]", "");

        return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        System.out.println(convertir("abc def"));
        System.out.println(convertir("áéíóú"));
        System.out.println(convertir("hello world"));
        System.out.println(convertir("a-b c"));
        System.out.println(convertir(""));
    }
}
