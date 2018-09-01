/*
���ģʽ����������֮��Ч�Ľ����ʽ����ʵ����һ��˼�롣

23�����ģʽ��
1���������ģʽ��
    ��������⣺���Ա�֤һ�������ڴ��еĶ����Ψһ�ԡ�
    
��α�֤����Ψһ���أ�
1.��������������ʹ�� new �����������
2.�ڸ��ഴ��һ������ʵ��
3.�����ṩһ������������������Ի�ȡ�������

���裺
1.˽�л�����Ĺ��캯��
2.ͨ��new�ڱ����д���һ������Ķ���
3.����һ�����еķ������������Ķ�������÷��ء�

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
//strving ����ʽ��
class Single1
{
    private static Single1 s = new Single1();
    private Single1(){};
    public static Single1 getInstance()
    {
        return s;
    }
}
//slacker ����ʽ��
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
