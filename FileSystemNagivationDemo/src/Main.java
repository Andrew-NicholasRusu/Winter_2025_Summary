public class Main {
    public static void main(String [] args) {
        // Create files
        File resume = new File("resume.pdf", 120);
        File vacationPhoto = new File("vacation.jpg", 2000);
        File birthdayPhoto = new File("birthday.jpg", 1500);
        File notes = new File("notes.txt", 45);

        // Create folders
        Folder photosFolder = new Folder("Photos");
        photosFolder.addItem(vacationPhoto);
        photosFolder.addItem(birthdayPhoto);

        Folder documentsFolder = new Folder("Documents");
        documentsFolder.addItem(resume);
        documentsFolder.addItem(photosFolder);
        documentsFolder.addItem(notes);

        // Print the entire file system starting from the root folder
        documentsFolder.print("");

    }
}