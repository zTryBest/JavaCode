package com.zzj.java8.test;

import com.zzj.java8.FunctionalConvert;

/**
 * @ClassName FunctionalTest
 * @Description TODO
 * @Author zzj
 * @Date 2020/1/9
 * @Version v1.0
 **/
public class FunctionalTest {
    public static void main(String[] args) {
        FunctionalConvert<String,Integer> functionalConvert=(String a)-> Integer.parseInt(a);
    }
}
