package com.groupeshm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @Test
    void add() {
        double result = Calculatrice.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    void sub() {
        double result = Calculatrice.sub(2, 1);
        assertEquals(1, result);
    }

    @Test
    void mul() {
        double result = Calculatrice.mul(1, 2);
        assertEquals(2, result);
    }

    @Test
    void div() {
        double result = Calculatrice.div(2, 2);
        assertEquals(1, result);
    }

    @Test
    void divIfBZero(){
        double result = Calculatrice.div(2,0);
        assertEquals(-1, result);
    }
}