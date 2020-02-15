## java8新特性
    1.接口可以实现默认方法
    2.函数式接口（注解：@FunctionalInterface)
    3.lambda表达式 （1.+ 2. 结合起来理解）
    4.foreach 用法
    5.可重复注解
    6.新的日期API
    
  对于lambda,其实每个lambda表达式都对应一个接口抽象方法的实现（函数式接口），
  一个lambda表达式返回值是一个实现了接口抽象方法的对象，
  **不能有两个抽象方法** （好好理解）
### lambda的作用域：
    lambda的可以从lambda表达式的外部范围访问final修饰的变量
    lambda不可以访问接口默认的非抽象方法，例子见InterfaceDefaultTest
    
**隐含的final变量**：如果int num=1,之后num没有被修改，num也是隐含被final修饰
int num=1 ---->  num=3 lambda表达式编译不成功
 
### 函数式接口：
    必须包含一个确切的 一个抽象方法 的声明 （就是不能有两个抽象方法）
    
"::" 这个标识符认识下，是调用静态方法或者构造方法，System.out.println() ---> System.out::println
  
