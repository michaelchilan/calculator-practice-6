package ec.edu.epn.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{20, 4, 80});
        objects.add(new Object[]{10, 9, 90});
        objects.add(new Object[]{22, 5, 110});
        objects.add(new Object[]{79, 31, 2449});
        objects.add(new Object[]{22, 4, 88});
        objects.add(new Object[]{12, 14, 168});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then_summation() {
        Calculator c = new Calculator();
        int actual = c.multiply(a,b);
        assertEquals(expected, actual);
    }
}