package Logic_Challenges;

public class MoverCeros {

    public static Object[] moverCeros(Object[] array) {
        int length = array.length;
        
        for (int i = length - 1; i >= 0; i--) {
            if (array[i].equals(0)) {
                for (int j = i - 1; j >= 0; j--) {
                    if (!array[j].equals(0)) {
                        Object temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Object[] array = {false, 1, 0, 1, 2, 0, 1, 3, "a"};
        Object[] resultado = moverCeros(array);
        
        for (Object elem : resultado) {
            System.out.print(elem + " ");
        }
    }
}
