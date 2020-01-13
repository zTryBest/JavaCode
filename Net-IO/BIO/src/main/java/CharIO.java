import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName CharIO
 * @Description 基于字符的I/O接口
 * @Author zzj
 * @Date 2020/1/13
 * @Version v1.0
 **/
public class CharIO {
    public void CharWrite(){
        try {
            FileWriter fileWriter = new FileWriter("b.txt");
            String str="牛逼啊 马飞，我是卢本伟";
            fileWriter.write(str);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CharIO().CharWrite();
    }
}
