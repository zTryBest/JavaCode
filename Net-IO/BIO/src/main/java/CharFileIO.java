import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * @ClassName CharIO
 * @Description 基于字符的I/O接口
 * @Author zzj
 * @Date 2020/1/13
 * @Version v1.0
 **/
public class CharFileIO {
    public void CharWrite(){
        try {
            FileWriter fileWriter = new FileWriter("b.txt");
            String str="牛逼啊 马飞，我是卢本伟";
            fileWriter.write(str);
            HashMap<Object, Object> map = new HashMap<>();

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CharFileIO().CharWrite();
    }
}
