package threadmethod;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName SleepMethod
 * @Description 线程睡眠,线程进行上下文切换，线程阻塞，进入time waiting状态,有个更直观的方法是TimeUnit.**.sleep
 * @Author zzj
 * @Date 2020/1/16
 * @Version v1.0
 **/
@Slf4j(topic = "c.sleep")
public class SleepMethod {
    public static void main(String[] args) {
        test01();
        log.info("main=====");

    }
    public static void test01(){
        Thread t1 = new Thread(() -> {
            log.info("线程开始");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("线程结束");
        },"t1");
        t1.start();
    }
}
