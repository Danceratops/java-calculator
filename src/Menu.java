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
    }

    public static String getOperation() {
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please enter an operation: ");
            choice = input.nextLine();
        } while(!Pattern.matches("[-+*/%q]", choice));

        return choice;
    }

    public static float getOperands() {
        Scanner input = new Scanner(System.in);
        float choice;

        System.out.println("Please enter a float: ");
        choice = input.nextFloat();

        return choice;
    }
}
