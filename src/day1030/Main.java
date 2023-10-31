package day1030;

public class Main {
    public static void main(String[] args) {
        Rotundity rotundity= new Rotundity(5,6);
        System.out.println("Rotund:"+rotundity.area());
        Rectangle rect= new Rectangle(11,10);
        System.out.println("Rect:"+rect.area());
        Triangle triangle= new Triangle(3,4);
        System.out.println("Triangle:"+triangle.area());
    }
}
