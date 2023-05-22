/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-02-02
 * Time:10:58
 */
import java.util.Scanner;

/*
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }

}

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }

}

class Data {
    public Data(int y) {
        this.y = y;
    }

    private int x;
    private int y;

     Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

     int getX() {
        return x;
    }

    int getY() {
        return y;
    }

}
*/
/*public class Test {

    public int aMethod(){
         int i = 0;

        i++;
        return i;
    }
    public static void main(String args[]){
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}*/
 class Pvf{
    static boolean Paddy;
    int a;
    int b;
   public static int n;
    public Pvf(int a){
        this.a=a;
    }
    public int sum(Pvf this,int a,int b){
        this.a=a;
        this.b=b;
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(Paddy);
    }
}
public class Test{

    private float f=1.0f;

    int m=12;

    static int n=1;


    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }


    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);
    }

    public static void main1(String args[]){

       /* Test t=new Test();

        int n=t.m;
        int b=Test.n;*/
        Pvf s=new Pvf(1);

        int sum=s.sum(2,3);
        Pvf.n=100;
        int b=s.n;
        System.out.println(sum);
    }

}