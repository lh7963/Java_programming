/*
Java�̳��еĳ�Ա��ϵ
         A:��Ա����
             a:����ĳ�Ա�������ƺ͸����еĳ�Ա�������Ʋ�һ�������̫��д�Ǹ����־ͷ����Ǹ����֣�
             b:����ĳ�Ա�������ƺ͸����еĳ�Ա��������һ���������ô������?
                 ����ķ������ʱ����Ĳ���˳��
                     �����෽���ľֲ���Χ�ң��о�ʹ�á�
                     ������ĳ�Ա��Χ�ң��о�ʹ�á�
                     �ڸ���ĳ�Ա��Χ�ң��о�ʹ�á�
                     �Ҳ������ͱ���
         B:��Ա����
             a:����ĳ�Ա�����͸����еĳ�Ա�������Ʋ�һ�������̫��
             b:����ĳ�Ա�����͸����еĳ�Ա��������һ���������ô������?
                 ͨ������������һ�������Ĳ���˳��
                     ���������ң��о�ʹ��
                     �ڸ������ң��о�ʹ��
                     �Ҳ������ͱ���
         C:���캯��
             a:����Ĺ��췽��Ĭ�ϻ�ȥ���ʸ�����޲ι��췽������Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ����ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
                 ��Ϊ��������ʸ������ݵĳ�ʼ����---��  ע�⣺����ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super();  ���ø����޲ι��졣
             b:���������û���޲ι��췽������ô��?����һ�����ڶ����ʱ��ϵͳĬ�ϸ����޲ι��죬һ�����Ǹ������вι��죬��ô��͹��콫���ٸ�������ʱ����Ĺ��췽�����޷�
���������������������ĵ�һ��Ĭ��super�������޷����ʵ��޲ι����޷�Ϊ�������ݼ��г�ʼ������˵��±���
                 ����ͨ��superȥ��ȷ���ô��ι��죬ͨ����ȷ�ĵ���ָ���ĸ�����ι��죬Ϊ�������ݽ��г�ʼ����
                 ����ͨ��this���ñ�����������죬����һ������һ��ȥ�����˸���Ĺ��죬this();
                 �ø����ṩ�޲ι��죬������������Ϊ���ø��������������ݽ��г�ʼ����
         
*/

//A:��Ա����
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
//B:��Ա����
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
//C:���캯��
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