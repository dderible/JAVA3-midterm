import java_midterm.patronMGNT.Patron;

public class Employee extends Patron {
    private String employeeNum;

    public Employee(String name, String address, String phoneNumber, String employeeNum){
        super(name, address, phoneNumber);
        this.employeeNum = employeeNum;
    }

    public String getPatronType(){
        return "Employee";
    }

    public String getEmployeeNum(){
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum){
        this.employeeNum = employeeNum;
    }

    public String toString() {
        return "Employee{" +
                "Name ='" + getName() + '\'' +
                ", Address ='" + getAddress() + '\'' +
                ", Phone Number ='" + getPhoneNumber() + '\'' +
                ", Employee # ='" + employeeNum + '\'' +
                ", Items Borrowed =" + getBorrowedItems() +
                '}';
    }
}
