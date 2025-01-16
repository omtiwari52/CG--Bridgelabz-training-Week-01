import java.util.Scanner;

public class ConvertTemperature {

    //method to convert Fahrenheit to celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    //method to convert Celsius to fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        //creating the instance of scanner class
        Scanner input= new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temp = input.nextDouble();

        System.out.println("Convert to (1) Celsius or (2) Fahrenheit?");
        int choice = input.nextInt();

        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
        //close scanner
        input.close();
    }
}
