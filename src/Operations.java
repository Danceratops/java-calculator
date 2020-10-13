public class Operations {
    public static String operator;
    public static float integerOne;
    public static float integerTwo;
    public static float results;

    public static float addition() {
        return integerOne + integerTwo;
    }

    public static float subtraction() {
        return integerOne - integerTwo;
    }

    public static float multiplication() {
        return integerOne * integerTwo;
    }

    public static float division() {
        return integerOne / integerTwo;
    }

    public static float modulus() {
        System.out.println("Any decimal values will be chopped off.");

        int forceChopOne = (int) integerOne;
        int forceChopTwo = (int) integerTwo;

        return forceChopOne % forceChopTwo;
    }

    public static void quit() {
        System.exit(0);
    }
}
