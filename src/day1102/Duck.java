/*
 * Copyright (c) 2023.
 * 高毅馨
 */

package day1102;
//定义一个实体类Duck 继承Animal抽象类
public class Duck extends Animals {
/*
私有属性：
1)name,string型、
2)表示鸭子的种类名称，即“鸭”。
表示鸭子的叫声sound,string型，即嘎嘎
方法：
共有构造方法：Duck（String n,String s）;
共有输出方法：toMyString(),输出鸭子的描述信息，如“name是鸭，sound是嘎嘎”。*/
    private String name;
    private String sound;
    public  Duck(String n,String s){
        this.name = n;
        this.sound = s;

    }
    public  void toMyString(){
        System.out.println("name是"+this.name+"，sound是"+this.sound);
    }


    @Override
    public void cry() {
        System.out.println(this.sound);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
