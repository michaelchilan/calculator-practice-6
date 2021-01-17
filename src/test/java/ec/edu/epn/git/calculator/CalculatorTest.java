package ec.edu.epn.git.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;

    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp()
    {
        System.out.println("setUp");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok()
    {
        System.out.println("Test 1");
        assertEquals(200, c.addition(136, 64));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok()
    {
        System.out.println("Test 2");
        assertEquals(139, c.subtraction(500, 361));
    }

    @Test
    public void given_two_integers_when_multiplied_then_ok()
    {
        System.out.println("Test 3");
        assertEquals(1245, c.multiply(15, 83));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_ok()
    {
        System.out.println("Test 4");
        assertEquals(1, c.division(1, 0), 0);
    }

    @After
    public void tearDown()
    {
        System.out.println("tearDown()");
        c.setAnswer(0);
    }
}