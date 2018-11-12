import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide,
//        each taking in two integers to perform the calculations on.

//maybe add some tests for floats....?

public class CalculatorTest {

    Calculator mycalc;

    @Before
    public void before(){
        mycalc = new Calculator();
    }


    @Test
    public void canAdd() {
        assertEquals(5, mycalc.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, mycalc.subtract(10, 8));
    }

    @Test
    public void canMultiply(){
        assertEquals(18, mycalc.multiply(3, 6));
    }

    @Test
    public void canDivide(){
        assertEquals(7, mycalc.divide(70, 10));
    }

    
}
