import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMICalculator calculator = new BMICalculator();

        double height = 0;
        double weight = 0;

        while (true) {
            try {
                System.out.print("Enter height in meters: ");
                height = Double.parseDouble(scanner.nextLine());
                calculator.setHeight(height);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
            } catch (HeightOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Enter weight in kg: ");
                weight = Double.parseDouble(scanner.nextLine());
                calculator.setWeight(weight);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
            } catch (WeightOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String result = calculator.ReturnSingaporeanBMIMeaning();
            System.out.println("BMI Interpretation: " + result);
        } catch (NoBMIException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}