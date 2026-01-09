import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    static Scanner scanner = new Scanner(System.in);

    // public static float readInput(String prompt) {
        
    // }

    public static float readInput(String prompt, int lowLimit, int highLimit) {
         
        System.out.print(prompt);
        return scanner.nextFloat();

        while (true) {
            System.out.print(prompt);

            try {
                input = scanner.nextFloat();

                if (input >= highLimit && input <= lowLimit)
                    break;

                System.out.print(errorMessage);
            } catch (InputMismatchException e) {
                System.out.println("Nederīga ievade. Lūdzu, ievadiet skaitli.");
                scanner.next(); // Consume the invalid input
            }
        }

        return input;
    }
}