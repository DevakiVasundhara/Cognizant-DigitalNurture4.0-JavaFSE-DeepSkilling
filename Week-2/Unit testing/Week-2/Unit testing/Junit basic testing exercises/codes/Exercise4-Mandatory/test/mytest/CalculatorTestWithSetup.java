package mytest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTestWithSetup {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Before each test: Calculator created");
    }

    @After
    public void tearDown() {
        calc = null;
        System.out.println("After each test: Calculator reset");
    }

    @Test public void testAdd() { assertEquals(15, calc.add(10, 5)); }
    @Test public void testSubtract() { assertEquals(13, calc.subtract(20, 7)); }
    @Test public void testMultiply() { assertEquals(18, calc.multiply(3, 6)); }
    @Test public void testDivide() { assertEquals(3, calc.divide(12, 4)); }
}
