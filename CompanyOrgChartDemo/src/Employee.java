public class Employee {
    String name;
    String position;
    double salary;

    // Constructor
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Method to print basic employee info
    public void printInfo(int level) {
        // Indent according to level
        for (int i = 0; i < level; i ++) {
            System.out.print("  ");
        }
        System.out.println(position + ": " + name + " ($" + salary + ")");
    }
}
