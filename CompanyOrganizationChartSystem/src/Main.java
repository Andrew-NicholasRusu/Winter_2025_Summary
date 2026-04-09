public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // Create employees
        Employee e1 = new Employee("Alice", "Manager");
        Employee e2 = new Employee("Bob", "Developer");
        Employee e3 = new Employee("Charlie", "Designer");
        Employee e4 = new Employee("Diana", "HR");
        Employee e5 = new Employee("Eve", "Intern");

        // Create departments
        Department tech = new Department("Technology");
        tech.addEmployee(e1);
        tech.addEmployee(e2);

        Department design = new Department("Design");
        design.addEmployee(e3);

        Department hr = new Department("HR");
        hr.addEmployee(e4);
        hr.addEmployee(e5);

        // Add sub-department
        tech.addSubDepartment(design);

        // Create company
        Company myCompany = new Company("EchNoza Inc.");
        myCompany.addDepartment(tech);
        myCompany.addDepartment(hr);

        myCompany.showOrganization();

        System.out.println("\nTotal Employees: " +myCompany.getTotalEmployees());
    }
}
