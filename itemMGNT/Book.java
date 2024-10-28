import java_midterm.itemMGNT.LibraryItem;

public class Book extends LibraryItem {
    private String type;

    public Book(String id, String title, String author, String isbn, String publisher, int copies, String type){
        super(id, title, author, isbn, publisher, copies);
        this.type = type;
    }

    // Created abstract method for item type.
    public String getItemType(){
        return "Book - " + type;
    }

    // Created getter and setter methods.
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    // Created toString method.
    public String toString(){
        return super.toString() + ", Book Type='" + type + "'";
    }
}
