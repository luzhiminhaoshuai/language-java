/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-02-12
 * Time:9:04
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x, y, z);
            System.out.println(sub.calculate());
        }
    }
}
class Base {

    private int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Sub extends Base {

    private int z;

    public Sub(int x, int y, int z) {
        super(x,y);//调用父类的构造方法，要先帮父类构造
        this.z=z;
        //write your code here
    }

    public int getZ() {
        return z;
    }

    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }

}