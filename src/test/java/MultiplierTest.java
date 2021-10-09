import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplierTest {
    @Test
    public void canMultiplySingleDigits() {
        Multiplier mul = new Multiplier();
        assertEquals(9, mul.multiply(3, 3));
        assertEquals(81, mul.multiply(9, 9));
    }

    @Test
    public void canMultiplyDoubleDigits() {
        Multiplier mul = new Multiplier();
        assertEquals(100, mul.multiply(10, 10));
        assertEquals(900, mul.multiply(30, 30));
    }

    @Test
    public void canMultiplyWithZero() {
        Multiplier mul = new Multiplier();
        assertEquals(0, mul.multiply(0, 0));
        assertEquals(0, mul.multiply(1, 0));
        assertEquals(0, mul.multiply(301203102, 0));
    }
}
