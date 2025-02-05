public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
 }
