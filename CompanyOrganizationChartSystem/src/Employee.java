public class Employee implements IDisplayable{
    private String name;
    private String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "- " + name + " (" + title + ")");
    }

}
