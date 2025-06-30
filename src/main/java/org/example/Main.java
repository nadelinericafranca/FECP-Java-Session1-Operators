package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter temperature in Celsius: ");

        float temperatureInCelsius = input.nextFloat();  // Read user input
        double temperatureInFahrenheit = temperatureInCelsius * 9/5 + 32; // Convert from Celsius to Fahrenheit

        System.out.println("Temperature in Fahrenheit: " + String.format("%.2f", temperatureInFahrenheit)); // Print output
    }
}