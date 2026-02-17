import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a circle");
            System.out.println("2. Create a rectangle");
            System.out.println("3. Display all objects");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter outline color: ");
                    String circleColor = scanner.nextLine();
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    circles.add(new Circle(circleColor, radius));
                    break;
                case 2:
                    System.out.print("Enter outline color: ");
                    String rectColor = scanner.nextLine();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    rectangles.add(new Rectangle(rectColor, height, width));
                    break;
                case 3:
                    System.out.println("\nCircles:");
                    for (Circle c : circles) {
                        System.out.println(c);
                    }
                    System.out.println("\nRectangles:");
                    for (Rectangle r : rectangles) {
                        System.out.println(r);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
