### Java基础知识点

### jdk、jre、jvm
* jdk: java开发工具包(含开发编译工具java.jar、javac.exe等，以及jre)
* jre:  java应用程序运行环境（含运行依赖库以及java虚拟机）
* jvm：java虚拟机
* 开发环境变量：JAVA_HOME（jdk根目录）、path环境变量设置(JAVA_HOME/bin)；注意：不要在中文路径下安装
1. windows 下安装，设置环境变量
2. Linux下安装，设置环境变量


### 应用程序
应用程序 = 数据结构 + 算法 + 文档

### java语言特性
1. 类、面向对象
2. 封装、继承、多态
3. 健壮性：没有C中的指针，自动垃圾回收（但不意味着内存不会溢出，堆栈不会溢出）
4. 跨平台（一次编码，一次编译，多平台使用：jvm作用）

### 保留字、关键字
*  用于定义数据类型的关键字：
> class、interface、enum、byte、short、int、long、float、double、char、boolean、void
*  用于定义流程控制的关键字：
> if、else、switch、case、default、while、do、for、break、continue、return
*  用于定义访问权限修饰符的关键字
  > private、public、protected

* 用于定义类、函数、变量修饰符的关键字
  > abstract、final、static、synchronized
 
* 用于定义类与类之间关系的关键字
  > extends、implements 

* 用于定义建立实例及引用实例，判断实例的关键字
  > new、this、super、instanceof
 
* 用于异常处理的关键字
> try、catch、finally、throw、throws

* 用于包的关键字
> package、import

* 其他修饰符关键字  
> native、strictfp、transient、volatile、assert

* 用于定义数据类型值的字面值
> true、false、null

* 包名：全部小写字母：abc.abc
* 文件名、类名：首字母大写，其后每个单词首字母大写：XxxYyy
* 变量名：首字母小写，其后每个单词首字母大写：xxxYyy
* 命名规范：首字母为字母、下划线_、美元符号；不可用数字、其他特殊符号为首字母命名
* 常量名：所有字母大学，多个单词用下划线连接：XXX_YYY_ZZZ
```java Hello.java
package com.exam;
/**
 *
 * 这是一个简单的java类例子
 * 
 * @author: Johnson
 * @version: 0.0.1
 */
public class Hello {
    
	/**
	 * 这是一个常量
	 */
	public static String CLASS_NAME = "com.exam.Hello";
	
	/**
	 * 这是主函数入口
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	
}
```

