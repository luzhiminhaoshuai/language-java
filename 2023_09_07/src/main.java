/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-09-07
 * Time:21:31
 */
public class main {
    public static void main(String[] args) {
        MyArraylist myArraylist = new MyArraylist();
        myArraylist.add(1);
        myArraylist.add(2);
        myArraylist.add(3);
        myArraylist.add(4);
        myArraylist.display();
        boolean n =myArraylist.contains(0);
        System.out.println(n);
        int a=myArraylist.indexOf(1);
        System.out.println(a);
    }

    public static void main1(String[] args) {
        Exercise exercise = new Exercise();
        int[] arr = {1, 3, 2, 3, 4, 3, 3, 5};
        int n = exercise.removeElement(arr, 3);
        System.out.println(n);
    }
}
