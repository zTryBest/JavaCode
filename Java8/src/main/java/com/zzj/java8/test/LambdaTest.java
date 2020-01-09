package com.zzj.java8.test;

import com.zzj.java8.InterfaceDefault;
import com.zzj.java8.Lambda;

import java.util.Arrays;
import java.util.List;


/**
 * @ClassName LambdaTest
 * @Description TODO
 * @Author zzj
 * @Date 2020/1/9
 * @Version v1.0
 **/
public class LambdaTest {
    private static  List<String> list= Arrays.asList("peter","zzj","James");
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.SortJAVA8();
        System.out.println(list);


    }
}
