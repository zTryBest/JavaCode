package com.code.sta;

/**
 * @ClassName StaticVarReference
 * @Description 静态变量引用类型，类加载情况，如果静态方法想要使用静态变量，必须要先给引用静态变量new一个实例
 * @Author zzj
 * @Date 2020/1/13
 * @Version v1.0
 **/
public class StaticVarReference {
    private static StaticVar staticVar;
    StaticVarReference(){
        System.out.println("进行了实例化:"+staticVar);
    }

    public static void main(String[] args) {
        StaticVarReference staticVarReference = new StaticVarReference();
    }
}
