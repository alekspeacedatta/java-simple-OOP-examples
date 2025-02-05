public class Main {
    public static void main(String args[]){
        Student student1 = new Student("alex", 1.25);
        student1.addCourses("Calculus II");
        student1.addCourses("Computer Architecture");
        System.out.println("courses: " + student1.getCourses());
        System.out.println();
        Student student2 = new Student("axvleda", 2.50);
        student2.addCourses("JAVA");
        student2.addCourses("C#");
        System.out.println("courses: " + student2.getCourses());

    }
}