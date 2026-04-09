public class Director extends Manager {

    // Constructor
    public Director(String name, String position, double salary) {
        super(name, position, salary);
    }

    // No need to override printInfo because Director behaves like a Manager but higher level
}
