package com.gan;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class WeekTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("第一题");
        int[] nums = new int[]{73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(nextGreaterElement(nums)));
        System.out.println("第二题");
        int[] nums2 = new int[]{2,0,2,1,1,0};
        sortColors(nums2);
        System.out.println(Arrays.toString(nums2));
    }
    public static int[] nextGreaterElement(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums.length;i++) {
            while (!s.isEmpty() && nums[s.peek()] < nums[i]) {
                int top = s.pop();
                ans[top] = nums[i];
            }
            s.push(i);
        }
        return ans;
    }
    public static void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, i, l);
                l++;
                i++;
            }
            else if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
            }
            else {
                i++;
            }
        }
    }
    public static void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

}
