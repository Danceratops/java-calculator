import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    public static void displayMenu() {
        System.out.println("OPTIONS");
        System.out.println("/------------------------/");
        System.out.println("Addition: +");
        System.out.println("Subtraction: -");
        System.out.println("Multiplication: *");
        System.out.println("Division: /");
        System.out.println("Remainder: %");
        System.out.println("Quit: q");
        System.out.println("Please enter an operation: ");
    }

    public static String getOperation() {
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            choice = input.nextLine();
        } while(Pattern.matches(".[-+*/%q]", choice));

        return choice;
    }
}
