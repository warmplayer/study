package day1030;

public class Rectangle extends Shape{
    int width;
    int length;
    int area;
    public Rectangle(int x, int y) {
        super(x, y);
        this.width = x;
        this.length = y;
    }
    public int area(){
        this.area = width * length;
        return area;
    }
}
