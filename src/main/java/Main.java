import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        boolean shouldContinue = true;
        Calculator calculator = new Calculator();

        System.out.println("Enter a command (q to quit):");
        while(shouldContinue) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            String [] input = command.split(" ");

            switch(input[0]) {
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt( input[1])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(input[1])));
                    break;
                case "q":
                    shouldContinue = false;
                    break;
                default:
                    System.out.println("Unrecognized command");
            }
        }
    }
}
