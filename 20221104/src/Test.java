import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-01-29
 * Time:21:00
 */
public class Test {
    //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
    //**************************************************************
  public  static boolean consecutiveOddInt(int[] array){
      int n=0;
      boolean a;
      for (int i = 0; i < array.length; i++) {
          if(( array[i])% 2 !=0){
              n++;
          }else{
              n=0;
          }
        if(n>=3){
            return true;
        }
      }return false;
  }

    public static void main(String[] args) {
      int[] arr1={4,5,8,4,7,2,3,6,5};
      int[] arr2={4,4,5,5,5,9,6,6};
        boolean a=consecutiveOddInt(arr1);
      boolean b=consecutiveOddInt(arr2);
        System.out.println(a+" , "+b);
    }




    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素
    //(其实这道题的目的是让我们找数组里面最多的那个数)

    //中位数法（出现最多的那个数经过排序后一定出现在中间）
    public static int eleMent3(int[] num){
        Arrays.sort(num);
        return num[num.length/2];
    }

    //摩尔投票法
    //假设数组中每个不同的数字就代表一个国家，而数字的个数就代表这个国家的人数，他们在一起混战，就是每两个两个同归于尽。我们就可以知道那个人数大于数组长度一半的肯定会获胜。
    //就算退一万步来说，其他的所有人都来攻击这个人数最多的国家，他们每两个两个同归于尽，最终剩下的也是那个众数
    public static int eleMent2(int[] num) {
        int major =num[0];
        int count=0;
        for (int i = 0; i < num.length; i++) {
            if(0==count){
                major=num[i];
                count++;
            }else if(major==num[i]){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
    public static void main7(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int[] arr2={2,2,1,1,1,2,2,3,3,3,3,3,3,3,3,3,3,3};

       int a= eleMent2(arr);
       int b= eleMent2(arr2);
       int c=eleMent3(arr);
       int d=eleMent3(arr2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
//public static  void eleMent(int[] arr){
//    int n=arr.length;
//    int ret=0;
//    int []arr2=new int[];
//    for (int i = 0; i < arr.length; i++) {
//        ret=arr[i];
//        int sum=0;
//
//        for (int j = 0; j < arr.length; j++) {
//            if(arr[j]==ret){
//            sum++;
//            }
//            if(sum >n/2){
//                break;
//            }
//        }
//    }
//}



public  static int oncePresent(int[] arr){
    int i=0;
    Arrays.sort(arr);
    for ( i = 0; i < arr.length; i=i+2) {
        if(i==arr.length-1){
            break;
        }
        if(arr[i]!=arr[i+1]){
            break;
        }
    }
    return arr[i];
}
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static void main6(String[] args) {
        int[] arr=new int[]{5,5,1,6,6,9,9,7,7};
        int[] arr2={4,1,2,1,2};
        int[] arr3={2,2,1};

        int n=oncePresent(arr);
        int a=oncePresent(arr2);
        int b=oncePresent(arr3);

        System.out.println(n);
        System.out.println(a);
        System.out.println(b);

    }



    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    //你可以按任意顺序返回答案。
    //示例 1：
    //输入：nums = [2,7,11,15], target = 9
    //输出：[0,1]
    //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    public static void sumofTwoNum(int[] arr, int n) {
        int[] tar = new int[]{-1,-1};//因为数组的下标不会是-1；

        for (int i = 0; i < arr.length - 1; i++) {

             for (int j = i+1; j < arr.length; j++) {

                 if (arr[i] + arr[j] == n) {
                    tar[0] = i;
                    tar[1] = j;
                    break;
                }
            }
            if ((tar[0] !=-1) || (tar[1] !=-1)) {
                break;
            }
        }
        if ((tar[0] == -1) || (tar[1] == -1)) {
            System.out.println("null");
            return;
        }
        System.out.println(Arrays.toString(tar));


    }
    public static void main5(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2={5,6};
        sumofTwoNum(arr, 5);
        sumofTwoNum(arr2,11);
    }

    //冒泡排序
    //最坏的情况下
    //有n个元素需要排序n-1次
    //每次排序的趟数都一次减1
    public static int[] bubbleSort(int[] arr){
        int ret=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    ret=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=ret;
                }
            }
        }
        return arr;
    }

    public static void main4(String[] args) {
        int[] arr={12,54,8,7,9,63,2,1,4,8,5,5,6,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //
    //如数组：[1,2,3,4,5,6]
    //
    //调整后可能是：[1, 5, 3, 4, 2, 6]
    public static int[] parityCon(int[] arr) {
        int ret=0;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]%2==0){
              for(j=i;j<arr.length;j++){//遍历arr[i]后面的元素，当找到奇数就发生交换
                  if(arr[j]%2 != 0){
                      ret=arr[i];
                      arr[i]=arr[j];
                      arr[j]=ret;
                      break;//找到后退出循环
                  }
              }
           }
        }
        return arr;
    }
    public static void main3(String[] args) {
        int[] arr=new int[]{3,4,6,78,92,1,5,7,8,9,3,12,13};
        parityCon(arr);
        System.out.println(Arrays.toString(arr));
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
    // 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static int[] transForm(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int a = 0; a < arr.length; a++) {
            copy[a] = 2 * copy[a];
        }
        return copy;
    }

    public static void main2(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[] arr2 = transForm(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

    public static void main1(String[] args) {
        int[] arr1 = {5, 9, 8, 7, 2, 4};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1, 1, 3, 0);
        System.out.println(Arrays.toString(arr1));
    }
}
