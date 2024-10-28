import java_midterm.patronMGNT.Patron;

public class Student extends Patron {
    private String studentNum;

    public Student(String name, String address, String phoneNumber, String studentNum){
        super(name, address, phoneNumber);
        this.studentNum = studentNum;
    }

    public String getPatronType(){
        return "Student";
    }

    public String getStudentNum(){
        return studentNum;
    }

    public void setStudentNum(String studentNum){
        this.studentNum = studentNum;
    }

    public String toString() {
        return "Employee{" +
                "Name ='" + getName() + '\'' +
                ", Address ='" + getAddress() + '\'' +
                ", Phone Number ='" + getPhoneNumber() + '\'' +
                ", Student # ='" + studentNum + '\'' +
                ", Items Borrowed =" + getBorrowedItems() +
                '}';
    }
}
