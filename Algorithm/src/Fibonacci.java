public class Fibonacci {

    static int count = 0;

    public static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            count++;
            for (int i = 0; i < count; i++) {
                System.out.print("-");
            }
            System.out.println(num);
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    static int[] memorization;

    public static int fibonacci2(int num) {
        if (num == 0) { //边界条件
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        int[] memorization = new int[num + 1]; //防止越界
        if (memorization[num] == 0) {
            memorization[num] = memorization[num - 1] + memorization[num - 2];

        }
        // System.out.println(fibonacci2(num - 1) + fibonacci2(num - 2));
        return fibonacci2(num - 1) + fibonacci2(num - 2); // 递归调用计算，中间结果是存在memo中的


    }

    public static void main(String[] args) {
        fibonacci2(5);
    }

}
