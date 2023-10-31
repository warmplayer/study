package day1030;

public class Shape {

    private int x;
    private int y;
    private  int area;
    //矩形rectangle圆形rotundity 三角形triangle

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int area(){
        return 0;
    }
}
