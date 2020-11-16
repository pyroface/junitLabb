package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {

    @BeforeEach
    public void beforeEachTest(){
        System.out.printf("Running BeforeEach method\n");
    }
    @AfterEach
    public void AfterEachTest(){
        System.out.printf("Running AfterEach method\n");
    }

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
        System.out.println("Test add");
    }

    @Test
    void testSub() {
        Calculator calculator = new Calculator();
        assertNotEquals(6, calculator.sub(6,2));
        System.out.println("Test sub");
    }

    @DisplayName("Repeating Multiply")
    @RepeatedTest(2)
    void testMulti() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
        System.out.println("Test multiply");
    }

    @Test
    @Disabled
    void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(2, 2));
        assertTrue(1 == 2 );
        System.out.println("Test divide");
    }



}

