package day1025;

import java.util.Scanner;

public class Student {
    String name;
    Score score;

    public Student(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
class Score{

    double javascore;

    public Score(double javascore) {
        this.javascore = javascore;
    }

    public double getJavascore() {
        return javascore;
    }

    public void setJavascore(double javascore) {
        this.javascore = javascore;
    }
}
class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student students[] = new Student[30];
        for (int i = 0; i < 30; i++) {
            System.out.println("第"+i+"号学生姓名:");
            String name = scanner.next();
            Score score;
            System.out.println("第"+i+"号学生成绩");
            Student student = new Student(name, score = new Score(scanner.nextDouble()));

            students[i] = student;
        }

        System.out.println("平均成绩"+avg(students));
    }

    public static double avg(Student students[]) {
        double num = 0.0;
        double avg;
        for (int i = 0; i < students.length; i++) {
            System.out.println("姓名"+students[i].getName());
            System.out.println("成绩"+students[i].getScore().getJavascore());
            double javascore = students[i].getScore().getJavascore();
            num = num + javascore;
        }
        avg = num / students.length;
        return avg;
    }
}