package com.mundane.leetcode;


public class LeetCode977 {
//    给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

//    示例 1：
//    输入：nums = [-4,-1,0,3,10]
//    输出：[0,1,9,16,100]
//    解释：平方后，数组变为 [16,1,0,9,100]
//    排序后，数组变为 [0,1,9,16,100]

    //    示例 2：
//    输入：nums = [-7,-3,2,3,11]
//    输出：[4,9,9,49,121]
    public static void main(String[] args) {

        int[] nums = {-7,-3,2,3,11};
        Solution solution = new Solution();
        nums = solution.sortedSquares(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] sortedNums = new int[n];
            for (int left = 0, right = n - 1, index = n - 1; index >= 0; ) {
                if (nums[left] * nums[left] > nums[right] * nums[right]) {
                    sortedNums[index] = nums[left] * nums[left];
                    left++;
                } else {
                    sortedNums[index] = nums[right] * nums[right];
                    right--;
                }
                index--;
            }
            return sortedNums;
        }
    }
}
