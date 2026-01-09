public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("|===> Hipotekārā kredīta kalkulators <===|\n");

            int totalCreditSum = (int) Console.readInput(
                    "Ievadiet kredīta summu: ", 1_000, 1_000_000);

            float yearlyPercentageRate = Console.readInput(
                    "Ievadiet gada procentu likmi: ", 0, 30);

            int years = (int) Console.readInput(
                    "Ievadiet periodu gados: ", 1, 30);

            var mortgageCalculator = new MortgageCalculator(totalCreditSum, yearlyPercentageRate, years);
            System.out.println("Ikmēneša maksājums: "
                    + mortgageCalculator.calculate(totalCreditSum, yearlyPercentageRate, years) + " EUR");

            if (Console.readInputContinue("Vai vēlaties turpināt? Jā[1]/Nē[0]: ") == 0) {
                break;
            }
        }
    }
}