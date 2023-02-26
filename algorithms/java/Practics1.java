import java.util.Arrays;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Practics1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }

        throw new RuntimeException("no two nums");
    }

    public static void main(String[] args) {
        Practics1 practics = new Practics1();
        System.out.println(Arrays.toString(practics.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(practics.twoSum(new int[]{3, 2, 4, 6}, 6)));
        System.out.println(Arrays.toString(practics.twoSum(new int[]{3, 3}, 6)));
    }
}
