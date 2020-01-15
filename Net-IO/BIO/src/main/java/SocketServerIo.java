

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
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
        byte[] bytes = new byte[20];
        while (true) {

            InputStream inputStream = serverSocket.accept().getInputStream();
            inputStream.read(bytes);


        }
    }
}
