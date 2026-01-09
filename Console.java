import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    static Scanner scanner = new Scanner(System.in);

    public static float readInputContinue(String prompt) {
        System.out.print(prompt);
        return scanner.nextFloat();
    }

    public static float readInput(String prompt, int lowLimit, int highLimit) {
        float input;
        while (true) {
            System.out.print(prompt);
            try {
                input = scanner.nextFloat();

                if (input >= lowLimit && input <= highLimit) {
                    return input;
                }
                System.out.println("Lūdzu, ievadiet skaitli starp " + lowLimit + " un " + highLimit);
            } catch (InputMismatchException e) {
                System.out.println("Nederīga ievade. Lūdzu, ievadiet skaitli.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }
}