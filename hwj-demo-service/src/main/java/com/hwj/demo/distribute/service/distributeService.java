package com.hwj.demo.distribute.service;

import com.hwj.demo.distribute.common.DistributeContent;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Auther: heweijian
 * @Date: 2020/5/7
 * @Description:
 */
@Service
public class distributeService {


	/**
	 * 通过0-12随机判断范围，返回范围比例所属级别
	 * @return 订单分派的人员级别
	 */
	public static Integer orderDistributeLevel() {
		Integer random = getRandom();
		if (random < 2) {
			return DistributeContent.DISTRIBUTE_LEVEL_ONE;
		} else if (random <= 5) {
			return DistributeContent.DISTRIBUTE_LEVEL_TWO;
		} else {
			return DistributeContent.DISTRIBUTE_LEVEL_THREE;
		}
	}

	/**
	 *
	 * @return 0-12之间的随机数
	 */
	public static Integer getRandom() {
		Random random = new Random();
		return random.nextInt(12);
	}

	public static void main(String[] args) {
		int level1 = 0, level2 = 0, level3 = 0;
		for (int i = 0; i < 120000000; i++) {
			if (distributeService.orderDistributeLevel() == DistributeContent.DISTRIBUTE_LEVEL_ONE) {
				level1++;
			} else if (distributeService.orderDistributeLevel() == DistributeContent.DISTRIBUTE_LEVEL_TWO) {
				level2++;
			} else {
				level3++;
			}
		}
		System.out.println(level1/120000000D);
		System.out.println(level2/120000000D);
		System.out.println(level3/120000000D);
	}

}
