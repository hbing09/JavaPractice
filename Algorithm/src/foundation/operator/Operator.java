package foundation.operator;

public class Operator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;
        int num3 = 12;
        System.out.println(num2 / num1);  //1
        System.out.println(num2 % num1);  //3
        System.out.println(++num2);      //8 ++在前面就是先加
        System.out.println(num3++);      //12 ++在后面就是后加，当时不加
        System.out.println(num3);        //13
    }
}
