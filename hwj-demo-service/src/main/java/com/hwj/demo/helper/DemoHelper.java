package com.hwj.demo.helper;

/**
 * @Auther: heweijian
 * @Date: 2020/5/7
 * @Description:
 */
public class DemoHelper {
	private DemoHelper() {}

	private static class DemoHelperSingletonHolder {
		private static DemoHelper instance = new DemoHelper();
	}

	public static DemoHelper getInstance() {
		return DemoHelperSingletonHolder.instance;
	}
}
