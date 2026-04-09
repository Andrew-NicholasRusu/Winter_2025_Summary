public class File implements IFileSystemItem {
    String name;
    int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print (String indentLevel) {
        System.out.println(indentLevel + "File: " + name + " (" + size + "KB)");
    }
}
