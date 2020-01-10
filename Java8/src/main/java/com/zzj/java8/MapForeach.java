package com.zzj.java8;

import java.util.*;

/**
 * @ClassName MapForeach
 * @Description map的foreach用法
 * @Author zzj
 * @Date 2020/1/10
 * @Version v1.0
 **/
public class MapForeach {
    private Map<String,String> map;

    public void foreachAgo(){
           for(Map.Entry<String,String> entry :map.entrySet())
           {
               String s = entry.getKey() + entry.getValue();

           }

   }
    /**
     * @MethodName: foeachJava8
     * @Description: java8的foreach结合lambda表达式
     * @Param: []
     * @Return: void
     * @Author: zzj
     * @Date: 2020/1/10
    **/

   public void foeachJava8(){
       map.forEach((k,v)-> System.out.println(k+":"+v));
   }


    public static void main(String[] args) {
        MapForeach mapForeach = new MapForeach();
    }


}
