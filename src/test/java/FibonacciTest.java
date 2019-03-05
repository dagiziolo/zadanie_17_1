import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    @Test
    public void shouldSumFor2() {
        Fibonacci fibonacci = new Fibonacci();

        //given
        ArrayList<Integer> fibonacciSequence = fibonacci.createFibonacciSequence(2);
        //when
        int sum = fibonacci.sumEven(fibonacciSequence);
        //then
        assertThat(sum, is(2));
    }

    @Test
    public void shouldSumFor10() {
        Fibonacci fibonacci = new Fibonacci();

        //given
        ArrayList<Integer> fibonacciSequence = fibonacci.createFibonacciSequence(10);
        //when
        int sum = fibonacci.sumEven(fibonacciSequence);
        //then
        assertThat(sum, is(10));
    }

    @Test
    public void shouldSumFor20() {
        Fibonacci fibonacci = new Fibonacci();

        //given
        ArrayList<Integer> fibonacciSequence = fibonacci.createFibonacciSequence(20);
        //when
        int sum = fibonacci.sumEven(fibonacciSequence);
        //then
        assertThat(sum, is(10));
    }

    @Test
    public void shouldSumFor100() {
        Fibonacci fibonacci = new Fibonacci();

        //given
        ArrayList<Integer> fibonacciSequence = fibonacci.createFibonacciSequence(100);
        //when
        int sum = fibonacci.sumEven(fibonacciSequence);
        //then
        assertThat(sum, is(44));
    }
}
