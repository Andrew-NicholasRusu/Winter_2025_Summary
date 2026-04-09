public class Main {
    public static void main(String[] args) {
        // Create a director
        Director alice = new Director("Alice", "Director", 150000);

        // Create managers
        Manager bob = new Manager("Bob", "Manager", 100000);
        Manager eva = new Manager("Eva", "Manager", 105000);

        // Create employees
        Employee charlie = new Employee("Charlie", "Software Engineer", 70000);
        Employee dana = new Employee("Dana", "QA Engineer", 65000);
        Employee frank = new Employee("Frank", "UI/UX Designer", 68000);

        // Build relationships
        bob.addTeamMember(charlie);
        bob.addTeamMember(dana);

        eva.addTeamMember(frank);

        alice.addTeamMember(bob);
        alice.addTeamMember(eva);

        // Print the full org chart staring from Alice
        alice.printInfo(0);

    }
}
