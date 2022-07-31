package com.mundane.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode01 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                int n1 = nums[i];
                int n2 = target - n1;
                if (hashtable.containsKey(n2)) {
                    // 根据n2取出n2对应的index，所以n2必须作为key, index必须作为value
                    return new int[]{i, hashtable.get(n2)};
                }
                hashtable.put(n1, i);
            }
            return new int[0];
        }
    }

}
