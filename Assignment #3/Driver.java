import java.util.ArrayList;
import java.util.Scanner;

    public class Driver {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList <GeometricShape> shapes = new ArrayList<>();
            int choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Create a circle");
                System.out.println("2. Create a rectangle");
                System.out.println("3. Create a square");
                System.out.println("4. Compare two objects");
                System.out.println("5. Display all objects");
                System.out.println("6. Display all objects and their areas");
                System.out.println("7. Exit");
                System.out.print("Enter choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter outline color: ");
                        String colorC = scanner.nextLine();
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        shapes.add(new Circle(colorC, radius));
                        break;

                    case 2:
                        System.out.print("Enter outline color: ");
                        String colorR = scanner.nextLine();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        System.out.print("Enter width: ");
                        double width = scanner.nextDouble();
                        shapes.add(new Rectangle(colorR, height, width));
                        break;

                    case 3:
                        System.out.print("Enter outline color: ");
                        String colorS = scanner.nextLine();
                        System.out.print("Enter side length: ");
                        double side = scanner.nextDouble();
                        shapes.add(new Square(colorS, side));
                        break;

                    case 4:
                    if (shapes.size() < 2){
                        System.out.println("Not enough objects to compare.");
                    } else {

                        System.out.print("Enter index of first object: ");
                        int index1 = scanner.nextInt();
                        System.out.print("Enter index of second object: ");
                        int index2 = scanner.nextInt();
                        if (index1 < shapes.size() == index2 < shapes.size()) {
                            System.out.println("Objects are equal.");
                        } else {
                            System.out.println("Objects are not equal.");
                        }
                        break;
                    }
                    case 5:
                        for (GeometricShape shape : shapes) {
                            System.out.println(shape);
                        }
                        break;

                    case 6:
                        for (GeometricShape shape : shapes) {
                            System.out.println(shape + ", Area: " + shape.calcArea());
                        }
                        break;

                    case 7:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid Choice, Try Again...");
                }
            } while (choice != 7);
            scanner.close();
        }
    }
