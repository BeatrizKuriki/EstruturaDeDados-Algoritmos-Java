package entities;

public class PivotSolution {

	public int pivotIndex(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;
		int len = nums.length;
		if (len == 1)
			return 0;
		int sum = 0, leftSum = 0;
		for (Integer num : nums)
			sum += num;
		for (int i = 0; i < len; i++) {
			if (2 * leftSum + nums[i] == sum)
				return i;
			leftSum += nums[i];
		}

		return -1;
	}

}
