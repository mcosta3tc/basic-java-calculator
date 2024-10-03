package example.calculator;

import org.example.calculator.Calculator;
import org.example.calculator.record.ResultRecord;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testCalculateSum() {
        ResultRecord sumResult = calculator.calculate(1, 1, "+");
        Assertions.assertEquals(2, sumResult.result());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateOperator() {
        String string = "d";
        calculator.calculate(2, 3, string);
    }
}
