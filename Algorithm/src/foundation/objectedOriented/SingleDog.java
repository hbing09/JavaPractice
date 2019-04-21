package foundation.objectedOriented;

public class SingleDog {
    //属性
    public String name;

    public String gender;

    public String job;

    //构造函数 select none
    //1. 所有都是 public 类型
    //2. 没有 void，返回值
    //3. 函数名与类名一样

    public SingleDog() {
        //把 job 的属性编程 coder
        this.job = "SDE"; // this 指代 属性
        System.out.println("我们都是单身狗");
    }
    //select all时，会自动补全，如下：
    public SingleDog(String name, String gender, String job) {
        this.name = name;
        this.gender = gender;
        this.job = job;
    }

    //假如构造函数是这样的
    public SingleDog(String job) {
        this.job = job; //
        System.out.println(job); //输出的参数的 job
        System.out.println("我们都是单身狗");
    }



    // 如果不定义构造函数的话，java 是默认创建无参数的函数
    // 但是我们创建了有参数函数的话，则就没有无参数函数了。
    //方法
    public void work() {}

    public void play() {}
}
