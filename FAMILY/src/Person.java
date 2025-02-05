public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(get());
    }
    public String get(){
        String personInfo = name + " არის " + age + " წლის";
        return personInfo;
    }
}
