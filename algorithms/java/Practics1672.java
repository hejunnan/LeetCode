/**
 * 1672. 最富有客户的资产总量
 * <p>
 * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/richest-customer-wealth
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Practics1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int richI = 0;
            for (int i : account) {
                richI += i;
            }
            max = Math.max(richI, max);
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3}, {1, 2, 3}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
