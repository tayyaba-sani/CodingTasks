package com.codingtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    //Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
    //
    //0 <= a, b, c, d < n
    //a, b, c, and d are distinct.
    //nums[a] + nums[b] + nums[c] + nums[d] == target
    //You may return the answer in any order.

    //Input: nums = [2,2,2,2,2], target = 8
    //Output: [[2,2,2,2]]

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> fourSumList = new ArrayList<>();
        List<String> createFourSum = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            int j = i + 1;
            int l = nums.length - 2;
            int k = nums.length - 1;
            while (j < l) {
                while (l < k) {
                    int temp = nums[i] + nums[j] + nums[l] + nums[k];
                    if (temp == target) {
                        String str = nums[i] + "" + nums[j] + "" + nums[l] + "" + nums[k];
                        if (!createFourSum.contains(str)) {
                            createFourSum.add(str);
                            List<Integer> addList = new ArrayList<>();
                            addList.add(nums[i]);
                            addList.add(nums[j]);
                            addList.add(nums[l]);
                            addList.add(nums[k]);
                            fourSumList.add(addList);
                        }
                        k--;
                        l = k - 1;
                    } else if (temp < target) {
                        k--;
                        l = k - 1;
                    } else {
                        l--;
                    }

                    if (l == j) {
                        k--;
                        l = k - 1;
                        if (k == j || l == j) break;
                    }
                }
                j++;
                k = nums.length - 1;
                l = nums.length - 2;
            }
        }
        return fourSumList;
    }
}
