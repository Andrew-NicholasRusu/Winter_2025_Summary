import java.util.ArrayList;

public class Person {
    String name;
    ArrayList<Person> children;

    // Constructor
    public Person(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    // Method to add a child
    public void addChild(Person child) {
        children.add(child);
    }

}
