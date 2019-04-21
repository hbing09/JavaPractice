package foundation.array;

public class Array {
    public static void main(String[] args){
        //数组初始化
        int[] nums = new int[]{1,2,3,4,5};
        int[] nums2 = new int[5];
        //数组长度
        System.out.println(nums2.length); // 5
        //数组随机访问
        System.out.println(nums[3]);      // 4
        // 遍历数组，非常常用
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
