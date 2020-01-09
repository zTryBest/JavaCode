package com.zzj.java8;

/**
 * @ClassName FunctionalInterface
 * @Description 函数式接口理解
 * @Author zzj
 * @Date 2020/1/9
 * @Version v1.0
 **/
@FunctionalInterface  //如果定义了两个抽象方法，就会报错
public interface FunctionalConvert<F,T> {
    T convert(F from);

//    int convert(String from);

}
