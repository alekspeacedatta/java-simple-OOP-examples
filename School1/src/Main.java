import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Alex", 17);
        Student student2 = new Student("Luka", 16);
        Student student3 = new Student("Nino", 15);
        Student student4 = new Student("Mari", 14);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        Teacher teacher1 = new Teacher("Irakli Noselidze","Physics");
        Teacher teacher2 = new Teacher("Beqari","C++");
        Teacher teacher3 = new Teacher("Nino Mamaladze", "Geography");

        school.addTeachers(teacher1);
        school.addTeachers(teacher2);
        school.addTeachers(teacher3);

        SchoolClass physicsClass = new SchoolClass("Physics Class", teacher1);
        physicsClass.addStudent(student1);
        physicsClass.addStudent(student2);
        physicsClass.addStudent(student3);
        physicsClass.addStudent(student4);

        SchoolClass cppClass = new SchoolClass("C++ Class", teacher2);
        cppClass.addStudent(student4);
        cppClass.addStudent(student2);
        cppClass.addStudent(student1);

        SchoolClass geographyClass = new SchoolClass("Geography Class", teacher3);
        geographyClass.addStudent(student1);
        geographyClass.addStudent(student4);

        school.addSchoolClass(physicsClass);
        school.addSchoolClass(cppClass);
        school.addSchoolClass(geographyClass);

        System.out.println("School Information: ");
        System.out.println("Number of Students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getSchoolClasses().size());

        System.out.println();

        System.out.println("Physics Class Information: ");
        System.out.println("Class Name: " + physicsClass.getClassName());
        System.out.println("Class teacher: " + physicsClass.getTeacher().getName());
        System.out.println("Number of Students: " + physicsClass.getStudents().size());

        System.out.println();

        System.out.println("C++ Class Information: ");
        System.out.println("Class name: " + cppClass.getClassName());
        System.out.println("Class Teacher: " + cppClass.getTeacher().getName());
        System.out.println("Number of Students: " + cppClass.getStudents().size());

        System.out.println();

        System.out.println("Geography Class Information");
        System.out.println("Class name: " + geographyClass.getClassName());
        System.out.println("Class teacher: "+ geographyClass.getTeacher().getName());
        System.out.println("Number of Students: " + geographyClass.getStudents().size());

        System.out.println();

        System.out.println("Enter: 1 to see Physics students");
        System.out.println("Enter: 2 to see C++ Students");
        System.out.println("Enter: 3 to see Geography students");
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int n =1;
        while (n==1){
            if (x == 1){
                System.out.println("Students Info: "); physicsClass.getStudentsInfo();
                x = scan.nextInt();
            }
            else if (x == 2){
                System.out.println("Students Info: "); cppClass.getStudentsInfo();
                x = scan.nextInt();
            }
            else if (x == 3){
                System.out.println("Students Info: "); geographyClass.getStudentsInfo();
                x = scan.nextInt();
            }
            else {
                n--;
            }
        }




    }
    }
