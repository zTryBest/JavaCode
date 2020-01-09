package com.zzj.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Lambda
 * @Description lambda基本用法
 * @Author zzj
 * @Date 2020/1/9
 * @Version v1.0
 **/
public class Lambda {

    private List<String> list= Arrays.asList("peter","zzj","James");

    /**
     * @MethodName: SortAgo
     * @Description: 之前JAVA版本字符串集合排序的方法
     **/
    public void SortAgo(){
        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
    }

    /**
     * @MethodName: SortJAVA8
     * @Description: JAVA8字符串集合排序使用lambda表达式
     **/
    public void SortJAVA8(){
        Collections.sort(list,(String a,String b)->{
            return a.compareTo(b);
        });
        //更简单的方式
        Collections.sort(list,(String a,String b)->a.compareTo(b));
        //最简短的方式
        Collections.sort(list,(a,b)->a.compareTo(b));

    }



    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.SortJAVA8();
        System.out.println(lambda.list);

    }



}
