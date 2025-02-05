public class Main {
    public static void main(String[] args){
        Shape rectangle = new Rectangle(10, 12);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(7, 8, 6);

        System.out.println("rectangle area = " + rectangle.getArea() + "\nrectangle perimeter = " + rectangle.getPerimeter() + "\n");
        System.out.println("circle area = " + circle.getArea() + "\ncircle perimeter = " + circle.getPerimeter() + "\n");
        System.out.println("triangle area = " + triangle.getArea() + "\ntriangle perimeter = " + triangle.getPerimeter());
    }
}