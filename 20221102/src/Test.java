import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-01-15
 * Time:11:57
 */
public class Test {

   // 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

   public static void main(String[] args) {
       int[] arr=new int[100];
       for (int i = 0; i < 100; i++) {
           arr[i]=1+i;
       }
       printArray(arr);
   }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main8(String[] args) {
        int[] array=new int[100];
        for (int i = 0; i < 100; i++) {
            array[i]=1+i;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(array[i]+" ");
        }
    }


    //汉诺塔
    //pos1:初始位置
    //pos2:中转位置
    //pos3:目标位置
    //n是有几个片
public static void Hanoi(int n,char pos1,char pos2,char pos3) {
    if(n==1){
        move(pos1,pos3);
        return;
    }
    Hanoi(n-1,pos1,pos3,pos2);
    move(pos1, pos3);
    Hanoi(n-1,pos2,pos1,pos3);
}

    public static void main7(String[] args) {
        Hanoi(3,'A','B','C');

    }

public static void move(char pos1,char pos3){
    System.out.println(pos1+"->"+pos3);
}


//递归求斐波那契数列第n项
    public static int feiBo(int n){

            if(n==2||n==1){
                return 1;
            }
        return feiBo(n-1)+feiBo(n-2);
    }

    public static void main6(String[] args) {
        int n=feiBo(8);
        System.out.println(n);
    }


    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int intSum(int n){
        if(n>9){
      return  n%10+intSum(n/10);
    }else{
        return n;
    }
}

    public static void main5(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=intSum(in.nextInt());
        System.out.println(a);
    }



    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void printInt(int n){
        if(n>9){
            printInt(n/10);
        }
        System.out.println(n%10+" ");
    }
    public static void main4(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(scan.hasNextInt()){
            printInt(scan.nextInt());

        }

    }

//递归求和
    //n为几就求 1~n的累加
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main3(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(scan.hasNextInt()){
            int a=sum(scan.nextInt());
            System.out.println(a);
        }

    }

    //递归求n的阶乘
    public static int factorial(int n) {
      if(n==1){
          return 1;
      }
      return n*factorial(n-1);
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
           // in.hasNextLine();
            int n=in.nextInt();
            int fac = factorial(n);
            System.out.println(n + "的阶乘是 " + fac);
        }
    }

    public static void main1(String[] args) {
        int[] array={1,2,3,4};
        System.out.println(array);
        String ret= Arrays.toString(array);
        System.out.println(ret);
        System.out.println("=============");
        for(int z:array){
            System.out.println(z);
        }
    }
}
