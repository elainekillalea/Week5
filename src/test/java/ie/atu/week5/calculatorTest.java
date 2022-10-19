package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {
    Calculator mySum;

    @BeforeEach
    void setUp(){
        mySum = new Calculator();
    }

    @Test
    void testAdd(){
        assertEquals(6, mySum.add(4, 2));
    }

    @Test
    void testSub(){
        assertEquals(2, mySum.sub(4, 2));
    }

    @Test
    void testMult(){
        assertEquals(8, mySum.mult(4, 2));
    }

    @Test
    void testDiv(){
        assertEquals(2, mySum.div(4, 2));
    }

    @AfterEach
    void tearDown(){

    }
}
