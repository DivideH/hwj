package com.hwj.demo.base;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Auther: heweijian
 * @Date: 2020/4/1
 * @Description:
 */
public class InnerClass {

	public static void main(String[] args) {
		//获取内部静态类对象 new ExternalClass.InnerClass();  new InnerClass()+那个类中的静态类
		ThreadPoolExecutor.CallerRunsPolicy callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
	}
}
