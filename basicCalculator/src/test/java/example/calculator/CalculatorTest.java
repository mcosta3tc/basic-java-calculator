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

    @Test
    public void testCalculateMinus() {
        ResultRecord sumResult = calculator.calculate(1, 1, "-");
        Assertions.assertEquals(0, sumResult.result());
    }

    @Test
    public void testCalculateMultiply() {
        ResultRecord sumResult = calculator.calculate(4, 5, "*");
        Assertions.assertEquals(20, sumResult.result());
    }

    @Test
    public void testCalculateDivide() {
        ResultRecord sumResult = calculator.calculate(1, 1, "/");
        Assertions.assertEquals(1, sumResult.result());
    }

    @Test()
    public void testValidateOperator() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.calculate(2, 3, "invalidOperator"));
        Assertions.assertEquals("Invalid operator: invalidOperator", exception.getMessage());
    }

    @Test()
    public void testDivideByZero() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.calculate(2, 0, "/"));
        Assertions.assertEquals("Division by 0 is impossible", exception.getMessage());
    }
}
