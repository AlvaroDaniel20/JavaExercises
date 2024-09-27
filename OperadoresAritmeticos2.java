public class OperadoresAritmeticos2 {
    public static void main(String[] args) {
        double initialAmount = 1000.0;
        double weeklyWithdrawal = 200.0;
        int weeksInMonth = 4;

        double totalWithdrawn = weeklyWithdrawal * weeksInMonth;

        double remainingAmount = initialAmount - totalWithdrawn;

        if (remainingAmount < 0) {
            remainingAmount = 0;
        }

        System.out.printf("Dinero restante en la cuenta después de un mes: " + remainingAmount);
    }
}
