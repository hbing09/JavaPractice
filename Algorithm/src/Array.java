import java.util.Arrays;
import java.util.ArrayList;

public class Array {
    public static void array() {
        // int[] arr = new int[10]; //数组的 size 一定要在初始化的时候就确定
        int[] array = new int[]{1,2,3};  //赋值
        System.out.println(Arrays.toString(array)); //想要打印数组时经常用到的函数
        // output :[1, 2, 3]
        array[0] = 2;
        System.out.println(Arrays.toString(array)); //想要打印数组时经常用到的函数
        // output: [2, 2, 3]

        //for 循环的两种写法

        for (int i = 0; i < array.length; i++) {
            
        }

        for (int arr: array) {
            // 这种形式只用于一位数组

        }

        //二维
        int[][] array2 = new int[][] {
                {1,2,3},
                {2,3,4}
        };
        array2[1][2] = 3;

        for (int i = 0; i < array2.length; i++) { // i是行，j是列
            for (int j = 0; j < array2.length; j++) {
                int[] ints = array2[j];
                
            }
        }

    }

    public static void main(String[] args) {
        //array();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.remove(2);
        System.out.println(Arrays.toString(arrayList.toArray()) + arrayList.size());

    }
}

