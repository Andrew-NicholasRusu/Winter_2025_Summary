import java.util.ArrayList;
import java.util.List;

public class Company implements IDisplayable {

    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showOrganization() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.displayDetails("  ");
        }
    }

    public int getTotalEmployees() {
        int total = 0;
        for (Department d : departments) {
            total += d.getTotalEmployees();
        }
        return total;
    }
}
