package com.aguo.leetcode.eight;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Code Fruit
 * @date 2021/8/16 8:52
 * @Email 126089205@qq.com
 */
public class FullArraySolution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> numlists = new ArrayList<>();
        List<Integer> numlist = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        /*for (int num : nums) {
            numlist.add(num);
        }*/
        permuteArray(numlists,numlist,nums,flag);
        return numlists;
    }

    /**
     * 有重复全排列
     * @param numlists
     * @param numlist
     * @param nums
     * @param flag
     */
    public void permuteArray(List<List<Integer>> numlists,List<Integer> numlist,int[] nums,boolean[] flag){
        if (numlist.size() == nums.length){
            for (List<Integer> list : numlists) {
                boolean n = true;
                for (int i = 0; i < numlist.size(); i++) {
                    if (list.get(i) == numlist.get(i)){
                        n = (n && true);
                    }else {
                        n = (n && false);
                    }
                }
                if (n) return;
            }
            numlists.add(new ArrayList<>(numlist));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (flag[i]) continue;
            flag[i] = true;
            numlist.add(nums[i]);
            permuteArray(numlists,numlist,nums,flag);
            flag[i] = false;
            numlist.remove(numlist.size() - 1);
        }
    }


    public void permuteArray(List<List<Integer>> numlists,List<Integer> numlist,int start){
        if (start == numlist.size()){
            numlists.add(new ArrayList<>(numlist));
        }

        for (int i = start; i < numlist.size(); i++) {
            Collections.swap(numlist,i,start);
            permuteArray(numlists,numlist,start + 1);
            Collections.swap(numlist,i,start);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
       return null;
    }


    public List<List<Integer>> combine(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        List<List<Integer>> numlists = new ArrayList<>();
        permute(numlists,nums,1,n,k);
        return numlists;
    }

    public void permute(List<List<Integer>> numlists ,List<Integer> nums, int start,int n   , int k){
        if (nums.size() == k){
            numlists.add(new ArrayList<>(nums));
            return;
        }
        for (int i = start; i <= n; i++) {
            nums.add(i);
            permute(numlists, nums, i + 1,n, k);
            nums.remove(nums.size() - 1);
        }
    }


    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> numlists = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        conbination(numlists,nums,k,n,1,0);
        return numlists;
    }

    public void conbination(List<List<Integer>> numlists,List<Integer> nums,int k, int n,int start,int sum){

        if (k == nums.size()){
            if (n == sum) {
                numlists.add(new ArrayList<>(nums));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            sum += i;
            nums.add(i);
            conbination(numlists,nums,k,n,i + 1,sum);
            sum -= i;
            nums.remove(nums.size() - 1);
        }
    }

    @Test
    public void test(){
        //System.out.println(permute(new int[]{1,2,1}));
        //System.out.println(combine(4,2));
        System.out.println(combinationSum2(new int[]{1,2},3));
    }

    public int combinationSum4(int[] nums, int target) {
        List<List<Integer>> numlists = new ArrayList<>();
        List<Integer> numlist = new ArrayList<>();
        sum4(numlists,numlist,nums,target,0);
        return numlists.size();
    }


    public void sum4(List<List<Integer>> numlists,List<Integer> numlist,int[] nums,int target,int sum){
        if (target == sum){
            numlists.add(new ArrayList<>(numlist));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            numlist.add(nums[i]);
            sum += nums[i];
            sum4(numlists,numlist,nums,target,sum);
            sum -= nums[i];
            numlist.remove(numlist.size() - 1);
        }
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> numlists = new ArrayList<>();
        List<Integer> numlist = new ArrayList<>();
        sum2(numlists,numlist,0,0,target,candidates);
        return numlists;
    }

    public void sum2(List<List<Integer>> numlists,List<Integer> numlist,int sum ,int start,int target,int[] nums){
        if (sum == target){
            numlists.add(new ArrayList<>(numlist));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            numlist.add(nums[i]);
            sum += nums[i];
            sum2(numlists,numlist,sum,i + 1,target,nums);
            sum -= nums[i];
            numlist.remove(numlist.size() - 1);
        }
    }
}


