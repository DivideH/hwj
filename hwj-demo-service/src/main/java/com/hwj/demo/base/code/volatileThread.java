package com.hwj.demo.base.code;

/**
 * @Auther: heweijian
 * @Date: 2020/4/30
 * @Description:
 */
public class volatileThread implements Runnable {

	private static Integer a = 1;

	@Override
	public void run() {
		a = a + 1;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(a);
	}

}
