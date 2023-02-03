/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-02-02
 * Time:10:58
 */
import java.util.Scanner;

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

class Data {

    public int x;
    public int y;

    public Data(int x, int y) {
        x = x;
        y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
 class Test2 {
    public static void main1(String[] args) {
        long start =System.currentTimeMillis();//单位是毫秒
        System.out.println(start);
      /*  String s;
        System.out.println("s="+s); */
    }
}
