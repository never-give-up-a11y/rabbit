package second;

import java.util.Arrays;

//冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
//
//在加热器的加热半径范围内的每个房屋都可以获得供暖。
//
//现在，给出位于一条水平线上的房屋 houses 和供暖器 heaters 的位置，请你找出并返回可以覆盖所有房屋的最小加热半径。
//
//说明：所有供暖器都遵循你的半径标准，加热的半径也一样

public class second_add {

}

class Solution {
	// 时间复杂度为 O(logn+logm)
	public static int findRadius(int[] houses, int[] heaters) {
		// 如果供暖器只有一个 则不需要排序,取最大值和最小值做比对就可以，时间复杂度可以降为0(n)
		if (heaters.length == 1) {
			return t1(houses, heaters);
		}
		// 数据排序 和 变量初始化
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int min = 0;
		int heaterIndex = 1;
		int housesLength = houses.length;
		int heaterMaxIndex = heaters.length - 1;
		int i = 0;
		// 找到 第一个距离大于供暖器的房子
		while (i < housesLength && houses[i] < heaters[0]) {
			i++;
		}
		if (i != 0) {
			min = heaters[0] - houses[0];
		}
		// 判断每个房子最优的供暖器路线
		for (; i < housesLength; i++) {
			while (houses[i] > heaters[heaterIndex]) {
				if (heaterIndex == heaterMaxIndex) {
					// 供暖器先走到最后
					return Math.max(houses[housesLength - 1] - heaters[heaterIndex], min);
				}
				heaterIndex++;
			}
			int num = houses[i] - heaters[heaterIndex - 1]; // 当前房子前一个供暖器的距离
			int num1 = Math.abs(heaters[heaterIndex] - houses[i]); // 当前房子后一个供暖器的距离
			min = num >= num1 ? Math.max(min, num1) : Math.max(min, num);
		}
		return min;
	}

	public static int t1(int[] houses, int[] heaters) {
		int max = houses[0];
		int min = houses[0];
		for (int i = 1; i < houses.length; i++) {
			max = Math.max(max, houses[i]);
			min = Math.min(min, houses[i]);
		}
		return Math.max(Math.abs(max - heaters[0]), Math.abs(heaters[0] - min));

	}
}

