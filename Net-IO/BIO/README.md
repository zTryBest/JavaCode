## Java磁盘IO
java磁盘的IO是机器效率的重要指标,程序中要尽量避免使用太多的磁盘IO.

装饰器模式：
   就是不同的子类可以对应包装其他的子类，扩充更大的功能，要懂得这样去理解。
  
### 记忆字符和字节的方法
    方法名后面为 In/OutputStream  ---> 字节
    方法名后面为 Writer/Reader   --->  字符


有个缓冲区的方法要注意：
  执行bufferOutputStream.flush()才能将缓冲区的字节流全部写入输出流
  超过缓冲区的大小也会将字节流全部写入输出流
  out.close()也是如此，可以看看看源码