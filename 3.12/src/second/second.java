package second;

//快速排序

public class second {
	public static void main(String[] args) {
		int[] nums = { 1, 20, 5, 9, 97, 8, 10, 1, 7, 1, 1 };
		Solution s = new Solution();
		s.sorted(nums, 0, nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}

class Solution {
	public int[] sortArray(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		sorted(nums, left, right);
		return nums;
	}

	public void sorted(int[] nums, int left, int right) {
		if (left >= right) {
			return;
		}
		int key = left;
		int low = left ;
		int height = right;
		while (low < height) {
			while (nums[height] >= nums[key] && low < height)
				height--;
			while (nums[low] <= nums[key] && low < height)
				low++;

			if (low < height) {
				int temp = nums[low];
				nums[low] = nums[height];
				nums[height] = temp;
			}
		}
		int temp = nums[key];
		nums[key] = nums[height];
		nums[height] = temp;
		sorted(nums, left, height - 1);
		sorted(nums, height + 1, right);
	}
}

//class Solution {
//	public static void quickSort(int[] arr, int low, int high) {
//		int i, j, temp, t;
//		if (low > high) {
//			return;
//		}
//		i = low;
//		j = high;
//		// temp就是基准位
//		temp = arr[low];
//
//		while (i < j) {
//			// 先看右边，依次往左递减
//			while (temp <= arr[j] && i < j) {
//				j--;
//			}
//			// 再看左边，依次往右递增
//			while (temp >= arr[i] && i < j) {
//				i++;
//			}
//			// 如果满足条件则交换
//			if (i < j) {
//				t = arr[j];
//				arr[j] = arr[i];
//				arr[i] = t;
//			}
//
//		}
//		// 最后将基准为与i和j相等位置的数字交换
//		arr[low] = arr[i];
//		arr[i] = temp;
//		// 递归调用左半数组
//		quickSort(arr, low, j - 1);
//		// 递归调用右半数组
//		quickSort(arr, j + 1, high);
//	}
//
//}



//class QuickSort {
//    public static void quickSort(int[] arr,int low,int high){
//        int i,j,temp,t;
//        if(low>high){
//            return;
//        }
//        i=low;
//        j=high;
//        //temp就是基准位
//        temp = arr[low];
// 
//        while (i<j) {
//            //先看右边，依次往左递减
//            while (temp<=arr[j]&&i<j) {
//                j--;
//            }
//            //再看左边，依次往右递增
//            while (temp>=arr[i]&&i<j) {
//                i++;
//            }
//            //如果满足条件则交换
//            if (i<j) {
//                t = arr[j];
//                arr[j] = arr[i];
//                arr[i] = t;
//            }
// 
//        }
//        //最后将基准为与i和j相等位置的数字交换
//         arr[low] = arr[i];
//         arr[i] = temp;
//        //递归调用左半数组
//        quickSort(arr, low, j-1);
//        //递归调用右半数组
//        quickSort(arr, j+1, high);
//    }
// 
// 
//    public static void main(String[] args){
//        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
//        quickSort(arr, 0, arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}