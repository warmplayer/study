package day1030;

public class Triangle extends Shape{
    int width;
    int height;
    int area;


    public Triangle(int x, int y) {
        super(x, y);
        this.width = x;
        this.height = y;
    }
    public int area(){
        this.area = (width * height)/2;
        return area;
    }

}
