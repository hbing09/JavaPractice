package sortAlgorithm;

import java.util.Arrays;

public class SortStabilization {
    //private static void bubbleSort(int[] nums) {
    private static void bubbleSort(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {
            //System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(products));
            for (int j = products.length - 1 ; j > i; j--) {
                if (products[j].getPrice() < products[j - 1].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
                //System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(products));
            }
        }

        for (int i = 0; i < products.length - 1; i++) {
            System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(products));
            for (int j = products.length - 1 ; j > i; j--) {
                if (products[j].getSale() < products[j - 1].getSale()) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
                //System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(products));
            }
        }
    }

    /**
     * 不稳定
     * @param nums
     */
    private static void bubbleSort2(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {
            //System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(products));
            for (int j = products.length - 1 ; j > i; j--) {
                //if (nums[j] < nums[j - 1]) {
                // 如果改成以下这种，去掉等号们就会变成不稳定的
                if (products[j - 1].getPrice() >= products[j].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
                //System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(products));
            }
        }

        /**
         * 下面的问题在于，即便等于的情况下，两个还是会互相交换
         * 会影响之前排好的顺序
         */

        for (int i = 0; i < products.length - 1; i++) {
            //System.out.println("当前第" + (i + 1) + "轮状态：" + Arrays.toString(products));
            for (int j = products.length - 1 ; j > i; j--) {
                //if (nums[j] < nums[j - 1]) {
                // 如果改成以下这种，去掉等号们就会变成不稳定的
                if (products[j - 1].getSale() >= products[j].getSale()) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
                //System.out.println("第" + (i + 1) + "轮步骤：" + Arrays.toString(products));
            }
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(3, 10);
        Product product2 = new Product(1, 9);
        Product product3 = new Product(2, 9);
        Product product4 = new Product(0, 9);
        Product[] products = new Product[] {product1, product2, product3, product4};
        //bubbleSort(products);
        bubbleSort2(products);
        for (Product product: products) {
            System.out.println(product.toString());
        }
    }
}
