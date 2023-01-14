import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-01-11
 * Time:21:30
 */
public class Test {
    //方法的重载
    //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
    public static int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static double max(double a,double b,double c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }else{
                return c;
            }
        }
    }

    public static void main(String[] args) {
        int i=max(5,9);
        double j=max(6.3,6.9,7.9);
        System.out.println(i+"  "+j);
    }

   //方法的重载
   // 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }

        public static void main8(String[] args) {
          int sum1=sum(2,3);
          double sum2=sum(1.1,2.5,1.6);
            System.out.println(sum1 +" "+ sum2);
    }
//斐波那契数列
    //f（n）=f(n-1)+f(n-2)
    //求斐波那契数列的第n项 （迭代实现）
    public static int feiBoNaCci(int n){
        if(n==0){
            return 0;
        }
        if((n==1)||(n==2)){
            return 1;
        }
        int a=1;
        int b=1;
        int c=0;
        for (int i = 3; i <= n; i++) {
         c=a+b;
         a=b;
         b=c;
        }
        return c;
    }
public static void main7(String[] args) {
    Scanner in =new Scanner(System.in);
    while(in.hasNextInt()){
        System.out.println(feiBoNaCci(in.nextInt()));
    }
}

    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//
//​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
 public static int max3(int a,int b,int c){
        int d=max2(a,b);
        int pout=max2(d,c);
        return pout;
 }

    public static void main6(String[] args) {
        System.out.println( max2(2,6));
        System.out.println( max3(9,6,3));

    }


    //九九乘法口诀表
    public static void main5(String[] args) {
        int i=1;
        int j=1;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for ( i = 1; i <= n; i++){
            for(j=1;j<=i;j++){
                System.out.printf("%2d * %2d =%2d ",i,j,i*j);
            }
            System.out.println();
        }
        in.close();
    }

    //编写代码模拟三次密码输入的场景。
    // 最多能输入三次密码，密码正确，提示“登录成功”,
    // 密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序

    public static void main4(String[] args) {
        String pswd="wosjdinns";
        Scanner password=new Scanner(System.in);
        int n=3;
        while(password.hasNext()){
            String aa=password.nextLine();
            if(pswd.equals(aa)){//字符串比较不能用==比较，要用equals
                System.out.println("密码正确，登陆成功！");
                break;
            }else{
                System.out.println("密码错误!");
                n--;
            }
            if(n<1){
                System.out.println("3次都输入错误，退出程序！");
                break;
            }
        }
    }

//输出一个整数的每一位，如：123的每一位是3，2，1
public static void main3(String[] args) {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    while(n%10!=0){
        System.out.println(n%10);
        n/=10;
    }
}

//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main2(String[] args) {
        double n=1.0;
        double sum=0.0;
        while(n<=100){
        if(n%2!=0){
            sum=sum+(1/n);
        }else{
            sum=sum-(1/n);
        }
          n++;
        }
        System.out.println(sum);
    }


    public static boolean isLeapYear(int year){
        if(year<1000){
            System.out.println(1);
            return true;
        }
        else{
            System.out.println(2);
            return false;
        }
    }

    public static void main1(String[] args) {
        int n=(int)Math.pow(2,4);
        System.out.println(n);
        boolean ff= isLeapYear(100);
        System.out.println(ff);
    }
}
