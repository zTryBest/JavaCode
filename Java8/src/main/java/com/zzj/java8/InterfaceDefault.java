package com.zzj.java8;

/**
 * @IntefaceName InterfaceDefault
 * @Description Java8新版本 接口可以定义默认非抽象方法
 * @Author zzj
 * @Date 2020/1/9
 * @Version v1.0
 **/
public interface InterfaceDefault {
    //抽象方法
    public double calculate(int a);

    //默认非抽象方法
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}


