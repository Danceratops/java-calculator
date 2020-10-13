public class Calculator {
    public static void main(String[] args) {

        do {
            Menu.displayMenu();
            Operations.operator = Menu.getOperation();

            switch (Operations.operator) {
                case "+": {
                    Operations.integerOne = Menu.getOperands();
                    Operations.integerTwo = Menu.getOperands();
                    Operations.results = Operations.addition();
                    System.out.println(Operations.results);
                }
                break;

                case "-": {
                    Operations.integerOne = Menu.getOperands();
                    Operations.integerTwo = Menu.getOperands();
                    Operations.results = Operations.subtraction();
                    System.out.println(Operations.results);
                }
                break;

                case "*": {
                    Operations.integerOne = Menu.getOperands();
                    Operations.integerTwo = Menu.getOperands();
                    Operations.results = Operations.multiplication();
                    System.out.println(Operations.results);
                }
                break;

                case "/": {
                    Operations.integerOne = Menu.getOperands();
                    Operations.integerTwo = Menu.getOperands();
                    Operations.results = Operations.division();
                    System.out.println(Operations.results);
                }
                break;

                case "%": {
                    Operations.integerOne = Menu.getOperands();
                    Operations.integerTwo = Menu.getOperands();
                    Operations.results = Operations.modulus();
                    System.out.println(Operations.results);
                }
                break;

                case "q":
                case "Q":
                default: {
                    System.out.println("Existing Program Now...");
                    Operations.quit();
                }
            }
        }while(true);
    }
}
