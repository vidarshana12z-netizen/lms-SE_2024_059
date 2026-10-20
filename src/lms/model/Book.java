package PACKAGE_NAME.lms.model;

public class Book extends Libaryitem {
    private String author;
    public Book(String id, String title, String author) {
        // TODO: super(id, title); <- must be the first line
        // TODO: setAuthor(author);
    }

    public boolean calculateLateFee(int i) {

        return false;
    }
    // TODO: getAuthor()
    // TODO: setAuthor(String author) - reject null/blank with
    // IllegalArgumentException("Author cannot be blank")
}

