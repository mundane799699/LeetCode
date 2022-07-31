package com.mundane.leetcode;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = reverse(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reverse(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        // 这个边界条件很重要，当左指针不小于右指针(相撞或者左指针大于右指针)时就跳出循环
        // [1   2   3   4]
        //      ↑   ↑
        //      L   R
        while (start < end) {
            // 先将左边的那个放到一个临时变量里
            int temp = nums[start];
            // 将右边的放到左边
            nums[start] = nums[end];
            // 将左边的(刚才存到临时变量里了)放到右边
            nums[end] = temp;
            // 移动双指针
            start++;
            end--;
        }
        return nums;
    }

}
