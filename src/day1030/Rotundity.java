package day1030;

public class Rotundity extends Shape{

    int  r;
    int d;
    double area;
    public Rotundity(int x, int y) {
        super(x, y);
        this.r = x;
        this.d = y;
    }
    public int area() {
        this.area= Math.PI*r*r;
        return (int) Math.round(this.area);
    }
}
