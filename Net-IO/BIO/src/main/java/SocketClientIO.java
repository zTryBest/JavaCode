import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @ClassName SocketIO
 * @Description TODO
 * @Author zzj
 * @Date 2020/1/13
 * @Version v1.0
 **/
public class SocketClientIO {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",9999);
            String str="asfasfdasdf";
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(str.getBytes());
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
