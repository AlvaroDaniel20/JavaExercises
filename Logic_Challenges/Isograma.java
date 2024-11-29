package Logic_Challenges;

public class Isograma {

    public static boolean esIsograma(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        str = quitarAcentos(str.toLowerCase());

        if (str.contains(" ")) {
            return false;
        }

        str = str.replaceAll("[^a-z]", "");

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                return false;
            }
        }

        return true;
    }

    private static String quitarAcentos(String str) {
        return str.replaceAll("[áàäâã]", "a")
                  .replaceAll("[éèëê]", "e")
                  .replaceAll("[íìïî]", "i")
                  .replaceAll("[óòöôõ]", "o")
                  .replaceAll("[úùüû]", "u")
                  .replaceAll("[ý]", "y")
                  .replaceAll("[ñ]", "n");
    }

    public static void main(String[] args) {
        System.out.println(esIsograma(""));
        System.out.println(esIsograma("mirada"));
        System.out.println(esIsograma("café"));
        System.out.println(esIsograma("área"));
        System.out.println(esIsograma("sol"));
        System.out.println(esIsograma("una palabra"));
    }
}
