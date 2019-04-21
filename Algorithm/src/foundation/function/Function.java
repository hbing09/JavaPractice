package foundation.function;

public class Function {
    public static void test1() {
        System.out.println("无参无返回");
    }
    public static int test2() {
        System.out.println("无参有返回");
        return 1;
    }
    public static void test3(int a) {
        System.out.println("有参无返回");
    }
    public static int test4(int a) {
        a = 1;
        System.out.println("有参无有返回");
        return a;
    }
    public static int overload() {
        System.out.println("重载1");
        return 1;
    }
    public static int overload(int a) {
        System.out.println("重载2");
        return 1;
    }

    public static int overload(int... b) {
        System.out.println("重载3");
        return 1;
    }

    public static void swap(int a, int b) {
        System.out.println("交换前： a = " + a +" b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后：a = " +a + " b = " + b);
    }

    public static void swap2(int[] nums) {
        System.out.println("交换前： num1 = " + nums[0] +" num2 = " + nums[1]);
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        System.out.println("交换后： num1 = " + nums[0] +" num2 = " + nums[1]);
    }


    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        swap(a,b);
        System.out.println("主方法： a = " + a + " b = " + b);
        System.out.println("-----------------");

        int[] nums = new int[]{1,3};
        swap2(nums);
        System.out.println("主方法： num1 = " + nums[0] + " num2 = " + nums[1]);
    }
}
