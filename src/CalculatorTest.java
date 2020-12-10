import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculatePrice() {
        Calculator calculator = new Calculator();
        int price = 69;

        assertEquals(calculator.calculatePrice(1200), price);
    }

    @Test
    void calculateSmolEngin() {
        Calculator calculator = new Calculator();
        int price = 88;

        assertEquals(calculator.calculatePrice(1399), price);
    }
}
