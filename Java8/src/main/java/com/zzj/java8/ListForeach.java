package com.zzj.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ListForeach
 * @Description TODO
 * @Author zzj
 * @Date 2020/1/10
 * @Version v1.0
 **/
public class ListForeach {
    private final List<String> list= Arrays.asList("aa","bb","cc");

    public void foreachAgo(){
        for (String entry:list)
        {
            System.out.println(entry);
        }
    }
    /**
     * @MethodName: foreachJAVA8
     * @Description: TODO
     * @Param: []
     * @Return: void
     * @Author: zzj
     * @Date: 2020/1/10
    **/

    public void foreachJAVA8(){

//        list.forEach(System.out::println);
//        list.forEach(a->System.out.println(a));
        list.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
    }

    public static void main(String[] args) {
        ListForeach listForeach = new ListForeach();
        listForeach.foreachJAVA8();
    }
}
