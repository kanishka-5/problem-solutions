import java.util.Arrays;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }



    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 3};
        int[] result = obj.getConcatenation(nums);

        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}