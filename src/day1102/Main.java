/*
 * Copyright (c) 2023.
 * 高毅馨
 */

package day1102;

public class Main {
    public static void main(String[] args) {
        Duck  duck = new Duck("鸭","嘎嘎");
        duck.cry();
        System.out.println(duck.getName());
        duck.toMyString();
    }
}
