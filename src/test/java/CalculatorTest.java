
import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // Happy path: adding two positive numbers
    @Test
    public void testAddPositiveNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    // Edge case: adding zero
    @Test
    public void testAddZero() {
        Calculator calculator = new Calculator();

        int result = calculator.add(5, 0);

        assertEquals(5, result);
    }

    // Unusual input: adding a negative number
    @Test
    public void testAddNegativeNumber() {
        Calculator calculator = new Calculator();

        int result = calculator.add(-2, 3);

        assertEquals(1, result);
    }
}
    //The test class mirrors the name of the class being tested (with Test at the end)
    //The test method name clearly describes what is being tested
    //The test can run independently and doesn’t rely on other tests
    //There is at least one test for the normal (“happy path”) case
    //There is at least one test for an edge case or unusual input
    //The test uses appropriate assertions to verify behavior

