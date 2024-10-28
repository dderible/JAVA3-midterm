package java_midterm.authorMGNT;
import java.util.ArrayList;
import java.util.List;
import itemMGNT.LibraryItem;
public class Author {
    private String name;
    private String dateOfBirth;
    private List<LibraryItem> writtenItems;

    public Author(String name, String dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = new ArrayList<>();
    }

    public void addWrittenItem(LibraryItem item){
        writtenItems.add(item);
    }

    public void removeWrittenItem(LibraryItem item){
        writtenItems.remove(item);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public List<LibraryItem> getWrittenItems(){
        return writtenItems;
    }

    public String toString(){
        return "Author{" +
        "Name ='" + name + '\'' +
        ", Date Of Birth ='" + dateOfBirth + '\'' +
        ", Books Written =" + writtenItems +
        '}';
    }
}
