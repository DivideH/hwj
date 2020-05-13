package com.hwj.demo.test;

/**
 * @Auther: heweijian
 * @Date: 2020/4/2
 * @Description:
 */
class A{
	public  A(){
		System.out.println("A.普通代码块");
	}
	{
		System.out.println("A.构造块");
	}
	static {
		System.out.println("A.静态块");
	}

}
class B extends A{
	public void B(){
		System.out.println("B.普通代码块");
	}
	{
		System.out.println("B.构造块");
	}
	static {
		System.out.println("B.静态块");
	}

}


public class RunTest {

	public RunTest() {
		System.out.println("在主函数中的类会不会被初始化生成一个对象");
	}

   static {
		//那里执行主线程函数，那里需要类加载。
	    //java文件中多个类，类的实例化需要按照顺序执行代码
	   System.out.println("是否类加载，展示静态代码块");
   }

	public static void main(String[] args) {
		System.out.println("*******start*******");
		new A();
//		new B();
//		new B();
		System.out.println("*******end*******");
	}
}
