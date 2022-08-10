import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Add {
    @Test
    void additionTest() {
        Sample calc = new Sample();
        assertEquals(2, calc.add(1,1), "The output should be the sum of the two arguments");
    }
    @Test
    void subtractionTest() {
        Sample calc = new Sample();
        assertEquals(0, calc.subtract(1,1), "The output should be the sum of the two arguments");
    }
    @Test
    void multiplyTest() {
        Sample calc = new Sample();
        assertEquals(1, calc.multiply(1,1), "The output should be the sum of the two arguments");
    }
    @Test
    void divideTest() {
        Sample calc = new Sample();
        assertEquals(2, calc.divide(4,2), "The output should be the sum of the two arguments");
    }
}