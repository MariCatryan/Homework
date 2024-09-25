//Temperature Conversion
//Write overloaded convertTemperature methods:
//One version accepts a temperature in Celsius and returns it in Fahrenheit.
//The other version accepts a temperature in Fahrenheit and returns it in Celsius.
//Additional Instructions
//Error handling: Handle cases where the input values are inappropriate

public class TemperatureConversion {

    public static double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertTemperature(double fahrenheit, boolean isFahrenheit) {
        if (!isFahrenheit) {
            System.out.println("Error: invalid value. Expected value in degrees Fahrenheit.");
            System.exit(1);
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit = convertTemperature(25);
        System.out.println("25°C to Fahrenheit: " + fahrenheit);

        double celsius = convertTemperature(77, true);
        System.out.println("77°F to Celsius: " + celsius);

    }
}
