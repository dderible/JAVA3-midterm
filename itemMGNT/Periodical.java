import java_midterm.itemMGNT.LibraryItem;

public class Periodical extends LibraryItem{
    private String type;

    public Periodical(String id, String title, String author, String isbn, String publisher, int copies, String type){
        super(id, title, author, isbn, publisher, copies);
        this.type = type;
    }

    public String getItemType(){
        return "Periodical - " + type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return super.toString() + ", Periodical Type='" + type + "'";
    }
    
}
