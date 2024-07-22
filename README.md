# Conversion

# Step 1: Create a New Project in NetBeans
- **Open NetBeans.**
- **Go to File -> New Project.**
- **Select Java under Categories and Java Application under Projects. Click Next.**
- **Name your project, e.g., Conversionunit. Ensure "Create Main Class" is checked and set to something like Conversionunit.Main. Click Finish.**

# Step 2: Create the Conversion Program
- **Open the Main.java file in the unitconverter package.**
- **Replace the content with the following code:**

  import java.util.Scanner;


public class Conversionunit {
    public static void ConversionUnit(String[] args) {
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
            case "feet":
                if(toUnit.equals("meters")) {
                    result = converter.feetToMeters(quantity);
                }
                break;
            case "pounds":
                if(toUnit.equals("kilograms")) {
                    result = converter.poundsToKilograms(quantity);
                }
                break;
            case "fahrenheit":
                if(toUnit.equals("celsius")) {
                    result = converter.fahrenheitToCelsius(quantity);
                }
                break;
            default:
                System.out.println("Invalid conversion units.");
                System.exit(0);
        }

        System.out.println("The result of the conversion is: " + result);
    }
}

# Step 3: Run the Program
- **Right-click on the Main.java file and select Run File.**
- **Follow the prompts in the console to test your conversions.**

# Link your local repository to the GitHub repository:

git remote add origin
