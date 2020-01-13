package com.code.sta;

/**
 * @ClassName StaticMethod
 * @Description 静态方法的类加载（类初始化的时候并不会执行静态方法）
 * @Author zzj
 * @Date 2020/1/10
 * @Version v1.0
 **/
public class StaticMethod {
    private static int num;
    private static StaticVar staticVar;

    public StaticMethod(){
        System.out.println("进行了实例化");
    }

    public static void test(){
        System.out.println("Init=========");
       System.out.println(StaticVar.num);;
    }

    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();
        StaticMethod.test();
    }
}
