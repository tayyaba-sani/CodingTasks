package com.codingtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//    //
//    //Notice that the solution set must not contain duplicate triplets.
//
//    //Input: nums = [-1,0,1,2,-1,-4]
//    //Output: [[-1,-1,2],[-1,0,1]]

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        List<String> sumList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length -2; i++)
        {
            int j= i+1;
            int k = nums.length -1;

            while(j<k)
            {
                int temp = nums[i]+nums[j]+nums[k];
                if(temp == 0)
                {
                    String str = nums[i] + "" + nums[j] + "" + nums[k];
                    if(!sumList.contains(str))
                    {
                        sumList.add(str);
                        List<Integer> addList = new ArrayList<>();
                        addList.add(nums[i]);
                        addList.add(nums[j]);
                        addList.add(nums[k]);
                        threeSumList.add(addList);
                    }
                    j++;
                    k = nums.length-1;
                }
                else if( temp<0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return threeSumList;
    }

}
