
package conversionunit;



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
