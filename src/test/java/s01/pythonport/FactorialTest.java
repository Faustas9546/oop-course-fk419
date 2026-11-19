package s01.pythonport;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test 
    void simpleTest() {
        assertEquals(24, Factorial.factorial(4));
    }
    void longTest() {
        assertEquals(2432902008176640000L, Factorial.factorial(20));
    }
}
