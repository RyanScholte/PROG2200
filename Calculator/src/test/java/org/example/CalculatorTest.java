package org.example;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    Calculator c = new Calculator();

    @org.junit.jupiter.api.Test
    void add() {
        c.setOperand1(2.2);
        c.setOperand1(3.0);
        assertEquals(5.2,c.add());
    }

    @Test
    void subtract() {
        c.setOperand1(7.0);
        c.setOperand2(3.0);
        assertEquals(4.0, c.subtract());
    }

    @Test
    void multiply() {
        c.setOperand1(7.0);
        c.setOperand2(3.0);
        assertEquals(21.0, c.multiply());
    }

    @Test
    void divide() {
        c.setOperand1(12.0);
        c.setOperand2(3.0);
        assertEquals(4.0, c.divide());
    }
}

