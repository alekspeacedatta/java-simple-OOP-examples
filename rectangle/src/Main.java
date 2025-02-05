public class Main {
    public static void main(String args[]){
        rectangle rectangle = new rectangle(30, 40);

        System.out.println(rectangle.getValues());
        System.out.println("Rectangel area is " + rectangle.area() + " and his perimeter is " + rectangle.perimeter());

        System.out.println();
        rectangle.setWidth_Height(789, 312);

        System.out.println(rectangle.getValues());
        System.out.println("Rectangel area is now " + rectangle.area() + " and his perimeter is now " + rectangle.perimeter());
    }
}