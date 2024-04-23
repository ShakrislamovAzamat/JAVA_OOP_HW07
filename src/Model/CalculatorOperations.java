package Model;

public class CalculatorOperations {
    public static ComplexNumber addition (ComplexNumber firstNum, ComplexNumber secondNum) {
        double realPart = firstNum.getRealPart() + secondNum.getRealPart();
        double imaginaryPart = firstNum.getImaginaryPart() + secondNum.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber multiplication(ComplexNumber firstNum, ComplexNumber secondNum) {
        double realPart = firstNum.getRealPart() * secondNum.getRealPart() - firstNum.getImaginaryPart() * secondNum.getImaginaryPart();
        double imaginaryPart = firstNum.getRealPart() * secondNum.getImaginaryPart() + firstNum.getImaginaryPart() * secondNum.getRealPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber division(ComplexNumber firstNum, ComplexNumber secondNum) {
        double denominator = secondNum.getRealPart() * secondNum.getRealPart() + secondNum.getImaginaryPart() * secondNum.getImaginaryPart();
        double realPart = (firstNum.getRealPart() * secondNum.getRealPart() + firstNum.getImaginaryPart() * secondNum.getImaginaryPart()) / denominator;
        double imaginaryPart = (firstNum.getImaginaryPart() * secondNum.getRealPart() - firstNum.getRealPart() * secondNum.getImaginaryPart()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
