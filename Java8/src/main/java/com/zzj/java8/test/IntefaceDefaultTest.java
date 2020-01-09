package com.zzj.java8.test;

import com.zzj.java8.InterfaceDefault;

/**
 * @ClassName IntefaceDefaultTest
 * @Description TODO
 * @Author zzj
 * @Date 2020/1/9
 * @Version v1.0
 **/
public class IntefaceDefaultTest  {

    public static void main(String[] args) {
        InterfaceDefault interfaceDefault = new InterfaceDefault() {

            @Override
            public double calculate(int a) {
                //直接调用默认的非抽象方法
                return sqrt(a);
            }
        };
        System.out.println(interfaceDefault.calculate(100)+"===="+interfaceDefault.sqrt(16));

        final  int  cc=1;

//        InterfaceDefault interfaceDefault1=a -> sqrt(a);
        InterfaceDefault interfaceDefault1=a -> (a+cc)*100;

        int bb=1;
        interfaceDefault1=a -> (a+bb)*100;
      //  bb=3;


    }


}
