package java_midterm.patronMGNT;
import java.util.ArrayList;
import java.util.List;
import java_midterm.itemMGNT.LibraryItem;

public abstract class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<LibraryItem> borrowedItems;

    public Patron(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber= phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    public void borrowItem(LibraryItem item){
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item){
        borrowedItems.remove(item);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public List<LibraryItem> getBorrowedItems(){
        return borrowedItems;
    }

    public abstract String getPatronType();

    public String toString(){
        return "Patron{" +
        "Name ='" + name + '\'' +
        ", Address ='" + address + '\'' +
        ", Phone Number ='" + phoneNumber + '\'' +
        ", Items Borrowed =" + borrowedItems +
        '}';
    }
}
