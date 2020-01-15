import java.io.*;

/**
 * @ClassName ByteIO
 * @Description 基于字节的I/O接口
 * @Author zzj
 * @Date 2020/1/13
 * @Version v1.0
 **/
public class ByteFileIO {
    /**
     * @MethodName: ByteWrite
     * @Description: 字节输出流
     * @Param: []
     * @Return: void
     * @Author: zzj
     * @Date: 2020/1/13
    **/

    public void ByteWrite(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
            String str="牛逼啊 马飞，我是卢本伟";
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream,2);
//            bufferedOutputStream.write(str.getBytes());
//            bufferedOutputStream.close();
            byte[] bytes = str.getBytes();
            for (byte aByte : bytes) {
                System.out.println(aByte);
            }
            fileOutputStream.write(str.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ByteRead(){
        try {
            FileInputStream fileInputStream = new FileInputStream("a.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 1);
            bufferedInputStream.read();
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        new ByteFileIO().ByteWrite();
    }

}
