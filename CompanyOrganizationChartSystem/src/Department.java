import java.util.ArrayList;
import java.util.List;

public class Department implements  IDisplayable{

    private String name;
    private List<Employee> employees;
    private List<Department> subDepartments;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<Employee>();
        subDepartments = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void addSubDepartment(Department d) {
        subDepartments.add(d);
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Department; " + name);
        for (Employee e : employees) {
            e.displayDetails(indent + " ");
        }
        for (Department d : subDepartments) {
            d.displayDetails(indent + " ");
        }
    }

    // Bonus!
    public int getTotalEmployees() {
        int count = employees.size();
        for (Department d : subDepartments) {
            count += d.getTotalEmployees();
        }
        return count;
    }

}












