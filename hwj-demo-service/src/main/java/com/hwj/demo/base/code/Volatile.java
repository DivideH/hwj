package com.hwj.demo.base.code;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: heweijian
 * @Date: 2020/4/30
 * @Description:
 */
public class Volatile {

	public static void main(String[] args) {

		for (int i=0;i<1000;i++){
			volatileThread volatileThread = new volatileThread();
			volatileThread.run();
		}

	}

	}
