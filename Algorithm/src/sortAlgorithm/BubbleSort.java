package sortAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    /**
     * 冒泡排序
     * time:
     * 最好 - O(n) 即便已经排好序的，还是要遍历一遍；
     * 最坏 - O(n^2)；
     * 平均 - O(n^2)
     * space: O(1) 没有开辟额外的空间
     * 稳定性：稳定
     * @param nums
     */
    private static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(nums));
            for (int j = nums.length - 1 ; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
                System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(nums));
            }
        }
    }

    private static void bubbleSortBest(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            flag = false;
            System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(nums));
            for (int j = nums.length - 1 ; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    flag = true;
                }
                System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(nums));
            }
            if (!flag) {
                break;  // 认为是已经排好序的
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[] {5, 3, 6, 2, 7, 1, 8};
        int[] nums2 = new int[] {1, 2, 3, 4, 5, 6};
        bubbleSort(nums);
        bubbleSortBest(nums2);
    }
}
