package com.mundane.leetcode;

public class LeetCode278 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int result = solution.firstBadVersion(11);
        System.out.println(result);
    }

    static class VersionControl {
        public boolean isBadVersion(int version) {
            if (version >= 5) {
                return true;
            }
            return false;
        }
    }

    static class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return right;
        }
    }
}
