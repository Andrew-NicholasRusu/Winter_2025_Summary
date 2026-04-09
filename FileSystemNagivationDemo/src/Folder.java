import java.util.ArrayList;
import java.util.List;

// Implementing the Folder class
class Folder implements IFileSystemItem {
    String name;
    List<IFileSystemItem> items;

    public Folder(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    // Method to add a file or a folder
    public void addItem(IFileSystemItem item) {
        items.add(item);
    }

    @Override
    public void print(String indentLevel) {
        System.out.println(indentLevel + "Folder: " + name);
        for (IFileSystemItem item : items) {
            item.print(indentLevel + " "); // Increase indentation
        }
    }
}
