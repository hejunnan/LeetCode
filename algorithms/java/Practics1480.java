/**
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * 请返回 nums 的动态和。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/running-sum-of-1d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Practics1480 {
    public int[] runningSum(int[] nums) {
        // 垃圾，多用了个数组，空间复杂度上去了。
        int[] results = new int[nums.length];
        results[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            results[i] = results[i - 1] + nums[i];
        }
        return results;
    }
}
