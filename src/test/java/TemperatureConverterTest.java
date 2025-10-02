import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import week5.TemperatureConverter;

public class TemperatureConverterTest {

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void testIsExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-41));
        assertTrue(TemperatureConverter.isExtremeTemperature(51));
        assertFalse(TemperatureConverter.isExtremeTemperature(20));
    }

    @Test
    void testKelvinToCelsius() {
        assertEquals(-273.15, TemperatureConverter.kelvinToCelsius(0), 0.001);
        assertEquals(0, TemperatureConverter.kelvinToCelsius(273.15), 0.001);
        assertEquals(100, TemperatureConverter.kelvinToCelsius(373.15), 0.001);
        assertEquals(26.85, TemperatureConverter.kelvinToCelsius(300), 0.001);
        assertEquals(-173.15, TemperatureConverter.kelvinToCelsius(100), 0.001);
    }
}