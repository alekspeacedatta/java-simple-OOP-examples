public class Main {
    public static void main(String args[]){
        double r = 4;
        Circle circle = new Circle(r);
        System.out.println("Circle radius = " + circle.getRadius());
        System.out.println("Circle are = " + circle.getArea() + " and circumference = " + circle.getCircumference());

        r = 9.3;
        circle.setRadius(r);
        System.out.println();

        System.out.println("Circle radius = " + circle.getRadius());
        System.out.println("Circle are = " + circle.getArea() + " and circumference = " + circle.getCircumference());
    }
}