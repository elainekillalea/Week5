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
    void addition(){
        assertEquals(5, mySum.addition());
    }
}
