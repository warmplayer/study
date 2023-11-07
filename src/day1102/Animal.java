/*
 * Copyright (c) 2023.
 * 高毅馨
 */

package day1102;
/*
目的：练习继承和多态
1）：定义一个抽象类：Animal,有一个代表叫声的抽象方法，公有的方法，无返回值，第二个方法，获得动物名称的抽象方法，共有
2):定义一个实体类Duck 继承Animal抽象类
私有属性：
1)name,string型、
2) 表示鸭子的种类名称，即“鸭”。
表示鸭子的叫声sound,string型，即嘎嘎
方法：
共有构造方法：Duck（String n,String s）;
共有输出方法：toMyString(),输出鸭子的描述信息，如“name是鸭，sound是嘎嘎”。
**/

public abstract class Animals {
    public abstract void cry();

    public abstract String getName();

}

