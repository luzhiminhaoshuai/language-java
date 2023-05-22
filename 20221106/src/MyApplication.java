/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-02-03
 * Time:20:17
 */
class Test1 {
    public static void hello() {
        System.out.println("hello");
    }
}
public class MyApplication {
    public static void main1(String[] args) {
        // TODO Auto-generated method stub
        Test1 test=null;
        test.hello();
    }
}

 class TestDemo{

    private int count;

    public static void main(String[] args) {

        TestDemo test=new TestDemo(88);

        System.out.println(test.count);

    }

    TestDemo(int a) {

        count=a;

    }

}

