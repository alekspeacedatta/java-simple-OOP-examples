import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;
    public Employee(String name, double salary, LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public String getInfo(){
        String employeeInfo = "Name: " + name + "\n" + "Salary: " + salary + "\n" + "Year of coming: " + hireDate;
        return employeeInfo;
    }
    public int getYearOfService(){
        return Period.between(hireDate, LocalDate.now()).getYears();
    }
}
