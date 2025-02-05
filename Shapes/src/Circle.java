public class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    public double getPerimeter() {
        double perimeter = Math.PI * radius * 2;
        return perimeter;
    }
}
