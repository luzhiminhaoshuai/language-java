import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:luzhimin
 * Date:2023-09-07
 * Time:21:35
 */
//实现一个自己的顺序表
public class MyArraylist {

    public int[] elem;
    public int usedSize;//0
    //默认容量
    private static final int DEFAULT_SIZE = 10;

    public MyArraylist() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表:
     * 根据usedSize判断即可
     */
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        isDilitation();
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    /**
     * 判断当前的顺序表是不是满的！
     *
     * @return true:满   false代表空
     */
    public boolean isFull() {

        return this.usedSize == this.elem.length;
    }

    //扩容
    private void isDilitation() {
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);

        }
    }

    private boolean checkPosInAdd(int pos) {

        return true;//合法
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        checkIndex(pos);
        isDilitation();
        for (int i = usedSize-1; i >=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        elem[pos]=data;
        usedSize++;
    }

    private void checkIndex(int pos) {
        if (pos < 0 && pos > usedSize) {
            throw new IndexOutOfException("add位置不合法，请检查输入的合法性！！！");
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        checkGetIndex(pos);
        return this.elem[pos];

    }

    private void checkGetIndex(int pos) {
        if (pos < 0 && pos >= usedSize) {
            throw new IndexOutOfException("get位置不合法，请检查输入的合法性！！！");
        }
    }
//        private boolean isEmpty () {
//
//        }
//
//        // 给 pos 位置的元素设为【更新为】 value
//        public void set ( int pos, int value){
//
//        }

    /**
     * 删除第一次出现的关键字key
     *
     * @param key
     */
        public void remove ( int key){
                int isHas = indexOf(key);
                if(isHas==-1){
                    System.out.println("没有这个需要删除的元素");
                    return ;
                }
            for (int i = isHas; i < usedSize-1 ; i++) {
                this.elem[i]=this.elem[i+1];
            }
            usedSize--;
            elem[usedSize]=0;
            return;
        }

        // 获取顺序表长度
        public int size () {
         return this.usedSize;
        }
//
//        // 清空顺序表
        public void clear () {
            for (int i = 0; i < usedSize; i++) {
                elem[i]=0;
            }
            usedSize=0;
       }
}