import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-01-10
 * Time:20:05
 */
public class Test {


    //打印x型图案
    public static void main10(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(scan.hasNextInt()){
            int n=scan.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j||i+j==n-1){
                        System.out.print("*");
                    }else{

                        System.out.print(" ");
                    }
                }
                System.out.print("\n");

            }

        }
    }


    //求两个整数的最大公约数
    //相减法，我觉得最简单
    public static void main9(String[] args) {
        System.out.println("请输入两个整数！");
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        while((a-b)!=0){
            if(a>b) {
                a = a - b;
            }else {
                b=b-a;
            }

        }
        System.out.println("最大公约数是"+a);
        scan.close();
    }



//求一个整数，在内存当中存储时，二进制1的个数
    public static void main8(String[] args) {
        System.out.println("请输入一个整数！");
        Scanner num =new Scanner(System.in);
        while(num.hasNextInt()){
            int n=num.nextInt();
            int sum=0;
            for (int i = 1; i < 32; i++) {
                if((n&1)==1){
                    sum++;
                }
                n>>=1;
            }
            System.out.println(sum);
        }

    }

//判定素数
    //给定一个数字，判定一个数字是否是素数
    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int n= scan.nextInt();
            for (int i = 2; i <= n ; i++) {
                if(n%i==0&&n!=i){
                    System.out.println(n+"不是素数！");
                    break;
                }
                if(n==i){
                    System.out.println(n+"是素数");
                }
            }
        }
    }

//输出1000-2000之间的闰年
    //什么是闰年？
    //分为是100的倍数并且能被400整除 或者 能被4整除但不是100的倍数
    public static void main6(String[] args) {
        int i=1000;
        while(i<=2000){
            if((i%400==0)||(i%100!=0 &&i%4==0)){
                System.out.println(i);
                i++;
                continue;
            }
            i++;
        }
    }
    //编写一下程序数一下1~100整数中有多少个数字9
public static void main5(String[] args) {
    int i=1;
    int j=0;
    for ( i = 1; i <= 100 ; i++) {
        if(i%10==9){
            j++;
            continue;
        }
        if(i/10%10==9){
            j++;
        }
    }
    System.out.println("1~100中有"+j+"个数字9！");
}


//打印素数
public static void main4(String[] args) {
    for ( int i = 2; i <= 100; i++ ) {
        int j = 2;
        for (j = 2; j <= i; j++) {
            if (i % j == 0) {
                break;
            }
        }
        if (i == j) {
            System.out.println(i);
        }
    }
}

    public static void main3(String[] args) {
        Random random = new Random(123);
        //int randNum = random.nextInt(100);//[0,100)
        //int randNum = random.nextInt(100)+100;//[0,100)
        int randNum = random.nextInt(50) + 50;//[50,100)
        System.out.println(randNum);
        // Math.random();//作业
    }

    public static void main2(String[] args) {
       int i=1;
       while(i <= 100){
           if((i%3)==0&&(i%5)==0){

           }
       }

    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(n);
    }

}


