package org.example;

import org.example.calculator.Calculator;
import org.example.calculator.record.ResultRecord;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ResultRecord sum = calculator.calculate(1, 2, "+");
        ResultRecord subtraction = calculator.calculate(1, 2, "-");
        ResultRecord multiply = calculator.calculate(1, 2, "*");
        ResultRecord division = calculator.calculate(1, 2, "/");
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiply);
        System.out.println(division);
    }
}