import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTests {
    Main calc = new Main();

    @Test
    public void testAddNumber() {

        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testAdd() {

        assertEquals(10, calc.add(10, 10));
    }


    @Test
    public void testSubtract() {


        assertEquals(5, calc.subtract(5, 5));
    }

    @Test
    public void testMultiplyTwoNumbers() {


        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    public void testDivideTwoNumbers() {


        assertEquals(5, calc.divide(25, 5));
    }

    @Test
    public void testSquareRootOfPositiveInteger() {
        double result = calc.squareRootOf(9);
        assertEquals(3.0, result);
    }








}
