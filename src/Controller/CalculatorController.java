package Controller;

import Log.CalculatorLogger;
import Model.CalculatorOperations;
import Model.ComplexNumber;
import View.CalculatorView;

import java.util.Scanner;

public class CalculatorController {

    private ComplexNumber getComplexNumber(Scanner scanner){
        System.out.print("Input real part: ");
        double realPart = scanner.nextDouble();

        System.out.print("Input imaginary part: ");
        double imaginaryPart = scanner.nextDouble();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first complex number");
        ComplexNumber firstNum = getComplexNumber(scanner);

        System.out.println("Input second complex number");
        ComplexNumber secondNum = getComplexNumber(scanner);

        System.out.println("Choose operator (1 - Addition, 2 - Multiplication, 3 - Division): ");
        int operatorChoice = scanner.nextInt();

        ComplexNumber result = performOperation(firstNum, secondNum, operatorChoice);
        CalculatorView.displayResult(result.toString());

        CalculatorLogger.logOperation("Complex numbers: " + firstNum + ", " + secondNum + " Operator: " + operatorChoice + " Result: " + result);
    }

    private ComplexNumber performOperation(ComplexNumber firstNum, ComplexNumber secondNum, int operatorChoice) {
        switch (operatorChoice) {
            case 1:
                return CalculatorOperations.addition(firstNum, secondNum);
            case 2:
                return CalculatorOperations.multiplication(firstNum, secondNum);
            case 3:
                return CalculatorOperations.division(firstNum, secondNum);
            default:
                CalculatorView.displayError("Invalid operator");
                return null;
        }
    }
}
