import config.Constants;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName ThreadTest
 * @Description 同步等待
 * @Author zzj
 * @Date 2020/1/15
 * @Version v1.0
 **/
@Slf4j(topic = "c.sync")
public class Sync {
    public static void main(String[] args)  {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log.info("running");
            }
        };
        new Thread(runnable, "t2").start();
        Thread t=new Thread("t1"){
            @Override
            public void run() {
                log.debug("running");
            }
        };
        t.start();
        log.debug("running");

        FutureTask futureTask=new FutureTask(()->{
            log.debug("running");
            return "callable";
        });

        Object o = null;
        try {
            o = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        log.debug(o.toString());

        new Thread(futureTask,"t3").start();
    }

}
