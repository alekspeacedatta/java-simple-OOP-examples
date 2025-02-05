public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return height * width;
    }
    public double getPerimeter() {
        return 2 * (height + width);
    }
}
