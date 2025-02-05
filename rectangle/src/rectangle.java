public class rectangle {
    private int width, height;

    public rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void setWidth_Height(int width, int height){
        this.width = width;
        this.height = height;
    }
    public String getValues(){
        String info = "width = " + width + " height = " + height;
        return info;
    }
    public int area(){
        int area = width*height;
        return area;
    }
    public int perimeter(){
        int perimeter = width+height;
        return perimeter;
    }
}
