package com.mundane.leetcode;

public class LeetCode35 {
//        给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
//        如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//        nums 为 无重复元素 的 升序 排列数组
//        请必须使用时间复杂度为 O(log n) 的算法。

//        示例 1:
//        输入: nums = [1,3,5,6], target = 5
//        输出: 2

//        示例 2:
//        输入: nums = [1,3,5,6], target = 2
//        输出: 1

//        示例 3:
//        输入: nums = [1,3,5,6], target = 7
//        输出: 4
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        Solution solution = new Solution();
        int result = solution.searchInsert(nums, target);
        System.out.println(result);

    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int center = left + (right - left) / 2;
                if (nums[center] == target) {
                    return center;
                } else if (nums[center] < target) {
                    left = center + 1;
                } else {
                    right = center - 1;
                }
            }
            return left;
        }
    }

}




