/*
设计模式：对问题行之有效的解决方式。其实它是一种思想。

23中设计模式。
1，单例设计模式。
    解决的问题：可以保证一个类在内存中的对象的唯一性。
    
如何保证对象唯一性呢？
1.不允许其他程序使用 new 创建该类对象
2.在该类创建一个本类实例
3.对外提供一个方法让其他程序可以获取该类对象

步骤：
1.私有化该类的构造函数
2.通过new在本类中创建一个本类的对象
3.定义一个公有的方法，将创建的对象的引用返回。

*/

class Single
{
    private static Single s = new Single();
    //create a instance of the class
    private Single(){};
    //privatize constructor to make sure the instance cannot be created through "new". 
    public static Single getInstance()
    {
        return s;
    }
    //return the the reference of instance created when the class is loaded. And we can control it by adding condition statement
}

//example:
class Test
{
    private int num;
///////////////////////make the class Singleton_Pattern
    private static Test t = new Test();  
    private Test(){};
    public static Test getInstance()
    {
        return t;
    }
///////////////////////
    public void setNum(int num)
    {
        this.num = num;
    }
    
    public int getNum()
    {
        return num;
    }
}

//two way to make a class singleton:
//strving 饿汉式：
class Single1
{
    private static Single1 s = new Single1();
    private Single1(){};
    public static Single1 getInstance()
    {
        return s;
    }
}
//slacker 懒汉式：
class Single2
{
    private static Single2 s = null;
    private Single2(){};
    public static Single2 getInstance()
    {
        if(s == null)
            s = new Single2();
        return s;
    }
}
