package com.yan.sort.array;

public class Array {

    private int n;
    private int count;
    private int[] array;

    private Array(int count){
        this.count = 0;
        array = new int[count];
        this.n = count;
    }

    public boolean insert(int index,int num) {
        if (index<0 || index>count ) {
            //插入失败
            return false;
        }
        //全部右移一位，给出位置做插入
        for (int i = count; i>index;--i ){
            array[i] = array[i-1];
        }
        array[index] = num;
        count++;
        return true;
    }

    public boolean delete(int index){
        if (index<0 || index>=count ) {
            //删除失败
            return false;
        }
        for (int i = index+1;i < count;i++){
            array[i-1] = array[i];
        }
        count--;
        return true;
    }

    public int findData(int index){
        if (index<0 || index>=count ) {
            //查找失败
            return -1;
        }
        return array[index];
    }

    public void printAll(){
        for (int i =0;i< count;i++) {
            System.out.println("data = " + array[i]);
        }
    }

    public static void main(String[] arg) {
        Array testArray = new Array(10);
        testArray.printAll();
        for (int i = 0 ;i<10; i++) {
            testArray.insert(i,i);
        }
        testArray.printAll();

        testArray.delete(0);
        testArray.printAll();

        testArray.insert(8,888);
        testArray.printAll();
    }

    //定义整型数据data保存数据
//    public int data[];
//    //定义数组长度
//    private int n;
//    //定义中实际个数
//    private int count;
//
//    //构造方法，定义数组大小
//    public Array(int capacity){
//        this.data = new int[capacity];
//        this.n = capacity;
//        this.count=0;//一开始一个数都没有存所以为0
//    }
//
//    //根据索引，找到数据中的元素并返回
//    public int find(int index){
//        if (index<0 || index>=count) return -1;
//        return data[index];
//    }
//
//    //插入元素:头部插入，尾部插入
//    public boolean insert(int index, int value){
//        //数组中无元素
//
//        //if (index == count && count == 0) {
//        //    data[index] = value;
//        //    ++count;
//        //    return true;
//        //}
//
//        // 数组空间已满
//        if (count == n) {
//            System.out.println("没有可插入的位置");
//            return false;
//        }
//        // 如果count还没满，那么就可以插入数据到数组中
//        // 位置不合法
//        if (index < 0||index > count ) {
//            System.out.println("位置不合法");
//            return false;
//        }
//        // 位置合法
//        for( int i = count; i > index; --i){
//            data[i] = data[i - 1];
//        }
//        data[index] = value;
//        ++count;
//        return true;
//    }
//    //根据索引，删除数组中元素
//    public boolean delete(int index){
//        if (index<0 || index >=count) return false;
//        //从删除位置开始，将后面的元素向前移动一位
//        for (int i=index+1; i<count; ++i){
//            data[i-1] = data[i];
//        }
//        //删除数组末尾元素  这段代码不需要也可以
//        /*int[] arr = new int[count-1];
//        for (int i=0; i<count-1;i++){
//            arr[i] = data[i];
//        }
//        this.data = arr;*/
//
//        --count;
//        return true;
//    }
//    public void printAll() {
//        for (int i = 0; i < count; ++i) {
//            System.out.print(data[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Array array = new Array(5);
//        array.printAll();
//        array.insert(0, 3);
//        array.insert(0, 4);
//        array.insert(1, 5);
//        array.insert(3, 9);
//        array.insert(3, 10);
//        //array.insert(3, 11);
//        array.printAll();
//    }
}
