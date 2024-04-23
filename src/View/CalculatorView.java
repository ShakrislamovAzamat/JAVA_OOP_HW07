package View;

public class CalculatorView {

    public static void displayResult(String result) {
        System.out.println("Result: " + result);
    }

    public static void displayError(String message) {
        System.err.println("Error: " + message);
    }
}
