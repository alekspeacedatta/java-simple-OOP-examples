import java.util.ArrayList;

public class Student {
    private String name;
    private double GPA;
    private ArrayList <String> courses = new ArrayList<String>();
    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
        System.out.println(getInfo());
    }
    public String getInfo(){
        String info = "Name: " + name + "\n" + "GPA: " + GPA;
        return info;
    }
    public ArrayList<String > getCourses(){
        return courses;
    }
    public void addCourses(String course){
        courses.add(course);
    }
}
