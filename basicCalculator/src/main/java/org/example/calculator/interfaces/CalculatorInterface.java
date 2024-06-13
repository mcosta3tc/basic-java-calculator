package org.example.calculator.interfaces;


import org.example.calculator.record.ResultRecord;

public interface CalculatorInterface {
    ResultRecord calculate(int firstNumber, int secondNumber, String operator);
}
