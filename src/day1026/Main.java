package day1026;

public class Main extends Student {

    public Main(int id, String name, int age, String sex) {
        super(id, name, age, sex);
    }

    public static void main(String[] args){
        Main m = new Main(1, "John", 20, "Male");
        System.out.println("Student Class value\n"+m.getName()+"\n"+m.getSex()+"\n"+m.getAge()+"\n"+m.getId());
    }
}