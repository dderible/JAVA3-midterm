package java_midterm;
import java_midterm.Library;
import java_midterm.authorMGNT.Author;
import java_midterm.itemMGNT.Book;
import java_midterm.patronMGNT.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions;

public class LibraryTest {

    @Test
    public void testAddLibraryItem() {
        Library library = new Library();
        Book book = new Book("1001", "Coding 101", "Declan Derible", "978-3-16-148410-0", "Keyin Academy", 10);

        library.addItem(book);
        assertNotNull(library.searchItemByTitle("Coding 101"));
    }

    @Test
    public void testAddPatron() {
        Library library = new Library();
        Employee employee = new Employee("Declan Derible", "709 Newfoundland Drive", "111-1111", "ID1234");

        library.addPatron(employee);
        assertNotNull(library.searchPatronByName("Declan Derible")); 
    }

    @Test
    public void testBorrowItem() {
        Library library = new Library();
        Employee employee = new Employee("Declan Derible", "709 Newfoundland Drive", "111-1111", "ID1234");
        library.addPatron(employee);
        Book book = new Book("1001", "Coding 101", "Declan Derible", "978-3-16-148410-0", "Keyin Academy", 10);
        library.addItem(book);

        library.borrowItem(employee, "Coding 101");
        assertEquals(1, book.getCopies());
        assertTrue(employee.getBorrowedItems().contains(book)); 
    }
}
