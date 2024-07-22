# Unit Converter

This Java application allows you to convert units between different measurement systems. Currently, the program supports conversions for the following units:

- Feet to Meters
- Pounds to Kilograms
- Fahrenheit to Celsius

## Features

- User-friendly input prompts to guide the user through the conversion process.
- Modular design with a `Converter` class handling the conversion logic.
- Simple switch-case structure to determine the correct conversion based on user input.

## How to Use

1. **Clone the repository:**
   ```sh
  [ git clone https://github.com/yourusername/UnitConverter.git](https://github.com/Granny14/Conversion-.git)
  

## Open the project in NetBeans:

- **Open NetBeans.**
- **Go to File -> Open Project.**
- **Navigate to the cloned repository directory and open the project.**
- **Run the application:**

- **Right-click on Main.java in the unitconverter package.**
- **Select Run File.**
- **Follow the prompts in the console to perform unit conversions.**

## Program Flow
- **The user is prompted to enter the unit they want to convert from (feet, pounds, fahrenheit).**
- **The user is prompted to enter the unit they want to convert to (meters, kilograms, celsius).**
- **The user is prompted to enter the quantity to be converted.**
- **The program performs the conversion and displays the result.**

## Example Usage

- **Enter the unit you want to convert from (feet, pounds, fahrenheit):**
- **feet**
- **Enter the unit you want to convert to (meters, kilograms, celsius):**
- **meters**
- **Enter the quantity to be converted:**
- **10**
- **The result of the conversion is: 3.048**

## Code Structure
- **Main.java**
- **Handles user input and interaction. Uses the Converter class to perform the actual conversions.**
  import java.util.Scanner;

public class  conversionunit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit you want to convert from (feet, pounds, fahrenheit):");
        String fromUnit = scanner.nextLine().toLowerCase();

        System.out.println("Enter the unit you want to convert to (meters, kilograms, celsius):");
        String toUnit = scanner.nextLine().toLowerCase();

        System.out.println("Enter the quantity to be converted:");
        double quantity = scanner.nextDouble();

        Converter converter = new Converter();
        double result = 0;

        switch(fromUnit) {
            case "feet" -> {
                if(toUnit.equals("meters")) {
                    result = converter.feetToMeters(quantity);
                }
            }
            case "pounds" -> {
                if(toUnit.equals("kilograms")) {
                    result = converter.poundsToKilograms(quantity);
                }
            }
            case "fahrenheit" -> {
                if(toUnit.equals("celsius")) {
                    result = converter.fahrenheitToCelsius(quantity);
                }
            }
            default -> {
                System.out.println("Invalid conversion units.");
                System.exit(0);
            }
        }

        System.out.println("The result of the conversion is: " + result);
    }
}

## Converter.java
- **Contains methods to perform the actual unit conversions.**
  package converter;

public class Converter {
    public double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public double poundsToKilograms(double pounds) {
        return pounds * 0.45359237;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

## Output

## Contributing
- **Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.**

## License
- **This project is licensed under the MIT License.**
