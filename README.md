## javase 难点重点
- 装箱拆箱问题
    - 精度损失问题:由于浮点数由十进制转换为而二进制的过程中，并不是一个精确的值，只是一个近似值，这点可以参考浮点数十进制转二进制。其中float的尾数是24，double的尾数是53，在不超过的时候可以精确表示。
        - 在浮点数进行运算和表示int值的时候会发生精度损失。
        - 解决办法：java中使用java.math.BigDecimal来处理，类Basic演示了如何处理
        - 注:有一个疑问是为什么直接打印就不会损失，那是因为打印直接处理，而不是转为二进制
---
- IO流
    - 字节输入输出流
        - 基于字节的输入流InputStream一个一个字节的读取,无法处理中文
        - 基于字节的输出流OutputStream
    - 字符输入输出流
        - 基于字符的输入流Reader 可以处理中文
        - 基于字符的输出流Writer 输出就是写操作
    - 上述都是抽象类，使用的时候是用其子类实例化
---
- 多线程TODO
