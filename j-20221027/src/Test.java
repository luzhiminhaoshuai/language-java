/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-01-05
 * Time:11:15
 */
public class Test {
    public static void main(String[] args) {
        System.out.println( (1+2)*3);
    }
    public static void main13(String[] args) {
        boolean flg = (true == true) ? (true == true) ?  false : true : true;
        System.out.println(flg);
        int a = 10;
    }
    public static void main12(String[] args) {
        int a = -1;
        System.out.println(a >>> 1);
    }
    public static void main11(String[] args) {
        int a = 1;
        //System.out.println(!( a == 10));
        int b = 2;
        //此时 & 符号 ，如果左右两边都是布尔类型 那么也相当于逻辑运算
        //System.out.println(a == 1 & b == 2);
        //此时和刚刚的区别 在于  这里 不能够进行 短路求值了
        System.out.println(a == 2 & (1/0)==0);
    }
    public static void main10(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a == 1 ||  (1/0)==0);
        //System.out.println(a == 1 && b == 2);
        //System.out.println(a == 2 && b == 2);

        //System.out.println(a == 2 && (1/0)==0);
    }
    public static void main9(String[] args) {
        System.out.println(1 < 5);
        System.out.println(1 <= 5);
        System.out.println(1 > 5);
        System.out.println(1 >= 5);
        System.out.println(1 != 5);
        System.out.println(1 == 5);
        int a = 10;
        //System.out.println(3 < a < 100);
    }
    public static void main8(String[] args) {
        int a = 10;
        //int b = a++;//b = a;  a = a+1;
        int b = ++a;//a = a+1; b = a;
        System.out.println(a);
        System.out.println(b);

        int i = 10;
        i = i++;
        System.out.println(i);
    }
    public static void main7(String[] args) {
        int a = 10;
        a += 1; //a = a + 1
        System.out.println(a);

        short sh = 12;
        //sh = sh + 2;
        sh += 2;//理解为 帮我们进行了类型的转换
        System.out.println(sh);
    }
    public static void main6(String[] args) {
        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);

        System.out.println(11.5%2);
    }
    public static void main5(String[] args) {
        System.out.println(5/2);//2
        System.out.println((float)5/2);//2.5
        System.out.println(5/(float)2);
        System.out.println((float)(5/2));
    }
    public static void main4(String[] args) {
        String str = "bac";
        int ret = Integer.valueOf(str);
        System.out.println(ret);
        /*int ret3 = Integer.parseInt(str);
        System.out.println(ret+1);
        String str2 = "1.25";
        double d = Double.valueOf(str2);
        System.out.println(d); */
    }
    public static void main3(String[] args) {
        int a = 12345;
        String aa = a+"";
        System.out.println("--->"+aa);
        //通过点号 来调用类当中的方法
        String ret = String.valueOf(a);
        System.out.println(ret);

        float f = 12.5f;
        String ret2 = String.valueOf(f);
        System.out.println(ret2);
    }
    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        //在字符串当中，如果两个字符串进行相加  那么他的意思就是拼接的意思
        System.out.println(str1+str2);
        int a = 10;
        int b = 20;
        System.out.println("a = "+ a);
        System.out.println("b = " + b);
        System.out.println("a+b = "+(a+b));
        System.out.println("a+b = "+a+b);
        System.out.println(a+b +"是a+b的和");//(1 + 2) * 3 -->  1 + 2 * 3
    }
    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
        int a = 10;
        System.out.println(a);
    }
}

