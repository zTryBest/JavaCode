

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;

/**
 * @ClassName SocketServerIo
 * @Description TODO
 * @Author zzj
 * @Date 2020/1/13
 * @Version v1.0
 **/
public class SocketServerIo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        String str;
        ByteInputStream byteInputStream = new ByteInputStream(str);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(str);

        while (true) {
            System.out.println(String.valueOf(bytes));
            serverSocket.accept();

        }
    }
}
