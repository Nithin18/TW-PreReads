import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void Should_Return1_When_FactorialOf1() {
        assertEquals(1,Factorial.findFactorial(1));
    }

    @Test
    void Should_Return1_When_FactorialOf0() {
        assertEquals(1,Factorial.findFactorial(0));
    }

    @Test
    void Should_Return720_When_FactorialOf6() {
        assertEquals(720,Factorial.findFactorial(6));
    }

    @Test
    void Should_Return3628800_When_FactorialOf10() {
        assertEquals(3628800,Factorial.findFactorial(10));
    }

    @Test
     void Should_Return1307674368000_When_FactorialOf15() {
        assertEquals(1307674368000L,Factorial.findFactorial(15));
    }

    @Test
    void Should_Return0_When_FactorialOf21() {
        assertEquals(0,Factorial.findFactorial(21));
    }
}
