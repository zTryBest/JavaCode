package com.code.sta;

/**
 * @ClassName StaticVar
 * @Description 静态变量基本类型的类加载情况：类初始化的时候会先执行clint方法，给方法区中的静态变量赋值
 * @Author zzj
 * @Date 2020/1/13
 * @Version v1.0
 **/
public class StaticVar {
    public static int num=1;

    public StaticVar(){
        System.out.println("进行了实例化"+num);
    }

    public void setNum(int num1){
        num=num1;
    }

    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
    }


}
