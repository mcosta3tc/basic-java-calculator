package org.example.calculator;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.calculator.interfaces.CalculatorInterface;
import org.example.calculator.record.ResultRecord;

@Data
@NoArgsConstructor
@Builder
public class Calculator implements CalculatorInterface {

    @Override
    public ResultRecord calculate(int firstNumber, int secondNumber, String operator) {
        return switch (operator) {
            case "+" -> new ResultRecord(firstNumber + secondNumber);
            case "-" -> new ResultRecord(firstNumber - secondNumber);
            case "*" -> new ResultRecord(firstNumber * secondNumber);
            case "/" -> new ResultRecord(firstNumber / secondNumber);
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
