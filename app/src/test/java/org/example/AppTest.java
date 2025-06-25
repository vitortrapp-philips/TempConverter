package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testFahrenheitParaCelsius() {
        assertEquals(0.0, App.fahrenheitParaCelsius(32), 0.01);
        assertEquals(100.1, App.fahrenheitParaCelsius(214), 0.01);
    }

    @Test
    void testCelsiusParaFahrenheit() {
        assertEquals(32.0, App.celsiusParaFahrenheit(0), 0.01);
        assertEquals(212.0, App.celsiusParaFahrenheit(100), 0.01);
    }
}
