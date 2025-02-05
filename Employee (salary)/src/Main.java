public class Main {
    public static void main(String args[]){
        Employee greg = new Employee("greg","HR manager", 4650);
        System.out.println("Salary before rise = " + greg.getSalary());
        greg.raiseSalary(10.8);
        System.out.println("Salary after rises = " + greg.getSalary());
    }
}