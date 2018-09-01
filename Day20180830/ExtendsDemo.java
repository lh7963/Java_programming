/*
Java继承中的成员关系
         A:成员变量
             a:子类的成员变量名称和父类中的成员变量名称不一样，这个太简单写那个名字就访问那个名字！
             b:子类的成员变量名称和父类中的成员变量名称一样，这个怎么访问呢?
                 子类的方法访问变量的查找顺序：
                     在子类方法的局部范围找，有就使用。
                     在子类的成员范围找，有就使用。
                     在父类的成员范围找，有就使用。
                     找不到，就报错。
         B:成员方法
             a:子类的成员方法和父类中的成员方法名称不一样，这个太简单
             b:子类的成员方法和父类中的成员方法名称一样，这个怎么访问呢?
                 通过子类对象访问一个方法的查找顺序：
                     在子类中找，有就使用
                     在父类中找，有就使用
                     找不到，就报错
         C:构造函数
             a:子类的构造方法默认会去访问父类的无参构造方法，因为子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化。
                 是为了子类访问父类数据的初始化。---》  注意：子类每一个构造方法的第一条语句默认都是：super();  调用父类无参构造。
             b:父类中如果没有无参构造方法，怎么办?由于一个类在定义的时候系统默认给出无参构造，一旦我们给出了有参构造，那么午餐构造将不再给出，此时子类的构造方法将无法
　　　　　　　　　　的第一句默认super（）将无法访问到无参构造无法为父类数据疾行初始化，因此导致报错。
                 子类通过super去明确调用带参构造，通过明确的调用指定的父类带参构造，为父类数据进行初始化。
                 子类通过this调用本身的其他构造，但是一定会有一个去访问了父类的构造，this();
                 让父类提供无参构造，综上所述就是为了让父类先于子类数据进行初始化。
         
*/

//A:成员变量
class AFu // extends Object
{
    int num = 4;
}
class AZi extends AFu
{
    int num = 5;
    void show()
    {
        System.out.println(this.num+"..."+super.num);
    }
}
//B:成员方法
class BFu // extends Object
{
    public void toshow()
    {
        this.show();
    }
    public void show()
    {
        System.out.println("Fu show");
    }
}
class BZi extends BFu
{
    public void show()
    {
        System.out.println("Zi show");
    }
}
//C:构造函数
class CFu // extends Object
{
    CFu()
    {
        //super;
        show();
        //return;
    }
    void show()
    {
        System.out.println("Fu show");
    }
}
class CZi extends CFu
{
    int num = 8;
    CZi()
    {
        super();
        System.out.println("Zi run..."+num);
        return;
    }
    public void show()
    {
        System.out.println("Zi show..."+num);
    }
}

class ExtendsDemo
{
    public static void main(String[] args)
    {
        AZi az = new AZi();
        az.show();
        
        System.out.println("===============");
        
        BZi bz = new BZi();
        bz.toshow();
        
        System.out.println("===============");
        
        CZi cz = new CZi();
        cz.show();
    }
}