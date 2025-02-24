package first;

//�鲢���� ��ϰ

public class first {

}

class Solution {
	int[] temp;

	public int[] sortArray(int[] nums) {
		temp = new int[nums.length];
		sorted(nums);
		return nums;
	}

	public void sorted(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int mid = (left + right) / 2;

		sorted(nums, left, right);
	}

	public void sorted(int[] nums, int left, int right) {
		if (left >= right)
			return;

		int middle = (left + right) / 2;
		sorted(nums, left, middle);
		sorted(nums, middle + 1, right);

		merge(nums, left, middle, right);
	}

	public void merge(int[] nums, int left, int middle, int right) {
		int l = left;
		int r = middle + 1;
		int t = left;

		while (l <= middle && r <= right) {
			if (nums[l] < nums[r])
				temp[t++] = nums[l++];
			else {
				temp[t++] = nums[r++];
			}
			if (l > middle)
				while (r <= right)
					temp[t++] = nums[r++];
			if (r > right)
				while (l <= middle)
					temp[t++] = nums[l++];
		}
		for (int index = left; index <= right; index++) {
			nums[index] = temp[index];
		}
	}
}