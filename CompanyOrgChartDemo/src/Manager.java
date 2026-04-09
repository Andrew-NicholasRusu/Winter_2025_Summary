import java.util.ArrayList;

public class Manager extends Employee {
    ArrayList<Employee> team;

    // Constructor
    public Manager(String name, String position, double salary) {
        super(name, position, salary);
        this.team = new ArrayList<>();
    }

    // Add an employee to the team
    public void addTeamMember(Employee e) {
        team.add(e);
    }

    // Override printInfo to also print team recursively
    @Override
    public void printInfo(int level) {
        super.printInfo(level);
        for (Employee e : team) {
            e.printInfo(level + 1); // Recursively print team members
        }
    }
}