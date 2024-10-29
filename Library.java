package java_midterm;
import java.util.ArrayList;
import java.util.List;
import java_midterm.patronMGNT.Patron;
import java_midterm.itemMGNT.LibraryItem;
import java_midterm.authorMGNT.Author;

public class Library {
    private List<LibraryItem> items;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library(){
        this.items = new ArrayList<>();
        this.authors= new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addItem(LibraryItem item){
        items.add(item);
    }

    public void removeItem(LibraryItem item){
        items.remove(item);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void removeAuthor(Author author){
        authors.remove(author);
    }

    public void addPatron(Patron patron){
        patrons.add(patron);
    }

    public void removePatron(Patron patron){
        patrons.remove(patron);
    }

    public LibraryItem searchItemByTitle(String title){
        for(LibraryItem item: items){
            if(item.getTitle().equalsIgnoreCase(title)){
                return item;
            }
        }

        return null;
    }

    public Author searchAuthorByName(String name){
        for(Author author: authors){
            if(author.getName().equalsIgnoreCase(name)){
                return author;
            }
        }

        return null;
    }

    public LibraryItem searchItemByISBN(String isbn){
        for(LibraryItem item: items){
            if(item.getIsbn().equals(isbn)){
                return item;
            }
        }

        return null;
    }

    public Patron searchPatronByName(String name){
        for(Patron patron: patrons){
            if(patron.getName().equalsIgnoreCase(name)){
                return patron;
            }
        }

        return null;
    }
    
    public void borrowItem(Patron patron, String itemTitle){
        LibraryItem item = searchItemByTitle(itemTitle);
        if(item != null && item.getCopies() > 0){
            patron.borrowItem(item);
            item.setCopies(item.getCopies() - 1);
            System.out.println("You have rented out this book! Enjoy!");
        }else{
            System.out.println("ERROR: Book is not available. We apologize for the inconvience.");
        }
    }

    public void returnItem(Patron patron, String itemTitle){
        LibraryItem item = searchItemByTitle(itemTitle);
        if(item != null && patron.getBorrowedItems().contains(item)){
            patron.returnItem(item);
            item.setCopies(item.getCopies() + 1);
            System.out.println("Book has been successfully returned! We hope you enjoyed and look forward to your next loan!");
        }else{
            System.out.println("ERROR: Book could not be found. Please try again.");
        }
    }
}
