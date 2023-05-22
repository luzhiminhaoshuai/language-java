/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-02-12
 * Time:8:34
 */
 class Base1{
Base1(){
    System.out.println("base");
}
}
public class Alpha extends Base1 {
    public static void main(String[] args) {
        new Alpha();
        new Base1();
    }
}

class X{
    Y y=new Y();//1
    public X(){//2
        System.out.print("X");
    }
}
class Y{
    public Y(){//3
        System.out.print("Y");
    }
}
 class Z extends X{
    Y y=new Y();//4
    public Z(){//5
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}