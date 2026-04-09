public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Person grandparent = new Person("Grandparent");
        Person parent1 = new Person("Parent1");
        Person parent2 = new Person("Parent2");
        Person child1 = new Person("Child1");
        Person child2 = new Person("Child2");
        Person child3 = new Person("Child3");
        grandparent.addChild(parent1);
        grandparent.addChild(parent2);

        parent1.addChild(child1);
        parent1.addChild(child2);
        parent2.addChild(child3);

        printFamilyTree(grandparent, 0);
    }

    private static void printFamilyTree(Person person, int generation) {
        // Print indentation based on the generation level
        for (int i = 0; i < generation; i++) {
            System.out.print("  "); // two spaces per generation
        }
        //Print the person's name
        System.out.println(person.name);

        // Recursively print each child's subtree
        for (Person child : person.children) {
            printFamilyTree(child, generation + 1);
        }
    }
}