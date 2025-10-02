package week5;

public class Main {
    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " F = " + celsius + " C");
    }
}
