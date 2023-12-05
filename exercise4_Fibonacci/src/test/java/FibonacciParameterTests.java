

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.test.exercise4_Fibonacci.Fibonacci;

@RunWith(value = Parameterized.class)
public class FibonacciParameterTests {
    private int n, exp;

    @Parameters
    public static Collection<Object[]> numbers() {
        return Arrays.asList(new Object[][] {
            {0,0},
            {1,1},
            {2,1},
        });
    }

    public FibonacciParameterTests(int n, int exp) {
        this.n = n;
        this.exp = exp;
    }

    @Test
    public void testFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.compute(n);
        assertEquals(exp, result);
    }
}
