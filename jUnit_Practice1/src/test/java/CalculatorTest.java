import org.champ.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.subtract(9, 5));
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10, 5));
    }



}
