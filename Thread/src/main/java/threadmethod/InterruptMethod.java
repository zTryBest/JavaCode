package threadmethod;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName InterruptMethod
 * @Description 打断正常线程，打断睡眠线程，打断park线程  注意打断标记的影响
 * @Author zzj
 * @Date 2020/1/16
 * @Version v1.0
 **/
@Slf4j(topic = "c.interrupt")
public class InterruptMethod {

    public static void main(String[] args) {
        test03();
    }
    /**
     * @MethodName: test01
     * @Description: 打断正常线程,打断标记为True (但是线程并没有停下来）
     * @Param: []
     * @Return: void
     * @Author: zzj
     * @Date: 2020/1/16
    **/

    public static void test01(){
        Thread thread = new Thread(() -> {
            while (true) {
                log.info("running");
                log.info("interrupted,{}",Thread.currentThread().isInterrupted());   //interrupted,true
                if (Thread.currentThread().isInterrupted()){

                    break;
                }
            }
        });
        thread.setName("t0");
        thread.start();
        System.out.println(thread.getState());

        thread.interrupt();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println(thread.getState());

    }

    /**
     * @MethodName: test02
     * @Description: 打断睡眠线程，会抛出异常InterruptedException，打断标记为false.并不会终止线程
     * @Param:
     * @Return:
     * @Author: zzj
     * @Date: 2020/1/16
    **/
    public static void test02(){
        Thread t1 = new Thread(() -> {
            log.info("running");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                log.info("打断睡眠线程");
                log.info("interrupt,{}",Thread.currentThread().isInterrupted());//interrupt,false
                e.printStackTrace();
            }

        }, "t1");
        t1.start();
        t1.interrupt();
    }
    /**
     * @MethodName: test03
     * @Description: 打断park线程(park线程就是一直在卡在调用park方法处),打断标记为ture,且线程不为park状态
     * @Param:
     * @Return:
     * @Author: zzj
     * @Date: 2020/1/16
    **/
    public static void test03(){
        Thread t1 = new Thread(() -> {

            log.info("parking....");
            LockSupport.park();
            log.info("unpark");
            log.info("interrupt,{}", Thread.currentThread().isInterrupted());

        }, "t1");
        t1.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
        log.info("主线程结束勒");
    }


}
