package foundation.objectedOriented;

public class Main {
    public static void main(String[] args) {
        // 类的初始化/实例化
        SingleDog coder = new SingleDog();
        //SingleDog teacher = new SingleDog();
        coder.name = "Ivan";
        coder.gender = "male";
        coder.job = "SDE";

        SingleDog coder2 = new SingleDog();
        coder2.job = "SDE";

        SingleDog coder3 = new SingleDog();
        //默认的 job 是 SDE
        System.out.println(coder3.job);

        SingleDog coder4 = new SingleDog("SDE2");
        System.out.println(coder4.job);

        SingleDog teacher = new SingleDog();


        SingleDog coder5 = new SingleDog("Meng","male","SDE");
        System.out.println(coder5.name + coder5.gender + coder5.job);
        int a = 1;
        int[] nums = new int[5];

    }

}
