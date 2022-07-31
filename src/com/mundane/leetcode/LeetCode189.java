package com.mundane.leetcode;

/**
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * <p>
 * 示例 2:
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 */
public class LeetCode189 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        solution.rotate(nums, k);
    }

    static class Solution {
        public void rotate(int[] nums, int k) {
            int length = nums.length;
            int[] newNums = new int[length];
            for (int i = 0; i < length; i++) {
                int num = nums[i];
                int newIndex = (i + k) % length;
                newNums[newIndex] = num;
            }
            System.arraycopy(newNums, 0,  nums, 0, length);
        }
    }

}
