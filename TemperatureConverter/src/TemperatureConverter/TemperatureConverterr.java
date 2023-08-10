package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterr {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println(" Enter the Temperature in Fahrenheit");
double Fahrenheit=scan.nextDouble();
TemperatureConverter temperatureConverter = new TemperatureConverter();
double Celsius=temperatureConverter.convertFahrenheitToCelsius(Fahrenheit);
System.out.println(Celsius);
	}

}
