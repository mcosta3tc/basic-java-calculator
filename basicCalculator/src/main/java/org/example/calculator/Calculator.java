package org.example.calculator;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.calculator.interfaces.CalculatorInterface;
import org.example.calculator.record.ResultRecord;

/**
 * Calculator class
 */
@Data
@NoArgsConstructor
@Builder
public class Calculator implements CalculatorInterface {
    /**
     * Method that sum, substrate, multiply or divide two numbers
     *
     * @param firstNumber  A number to be calculated with the second number
     * @param secondNumber A number to be calculated with the first number
     * @param operator     A string use to calculate the first and the second number
     * @return A result as an ResultRecord
     */
    @Override
    public ResultRecord calculate(int firstNumber, int secondNumber, String operator) {
        validateOperator(operator);
        return switch (operator) {
            case "+" -> new ResultRecord(firstNumber + secondNumber);
            case "-" -> new ResultRecord(firstNumber - secondNumber);
            case "*" -> new ResultRecord(firstNumber * secondNumber);
            case "/" -> {
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Division by 0 is impossible");
                }
                yield new ResultRecord((double) firstNumber / secondNumber);
            }
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }


    /**
     * Verify if the provided operator is one of : +, -, *, /
     *
     * @param operator the operator provided by the calculate method
     */
    private void validateOperator(String operator) {
        if (!operator.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
