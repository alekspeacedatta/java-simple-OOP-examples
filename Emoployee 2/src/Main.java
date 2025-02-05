import java.time.LocalDate;

public class Main{
    public static void main(String args[]){
        Employee karl = new Employee("karl Yungech", 900, LocalDate.parse("2003-03-04"));
        System.out.println(karl.getInfo());
        System.out.println("Years of Service: " + karl.getYearOfService() + "y");

        System.out.println();

        Employee jake = new Employee("jake Alexsius", 3500.30, LocalDate.parse("2021-08-26"));
        System.out.println(jake.getInfo());
        System.out.println("Years of Service: " + jake.getYearOfService() + "y");
    }
}