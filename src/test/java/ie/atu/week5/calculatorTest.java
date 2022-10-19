package ie.atu.week5;

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
        assertEquals(6, mySum.add());
    }

    @Test
    void testSub(){
        assertEquals(2, mySum.sub());
    }

    @Test
    void testMult(){
        assertEquals(8, mySum.mult());
    }

    @Test
    void testDiv(){
        assertEquals(2, mySum.div());
    }
}
