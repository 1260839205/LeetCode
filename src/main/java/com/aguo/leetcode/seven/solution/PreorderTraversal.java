package com.aguo.leetcode.seven.solution;

import com.aguo.leetcode.seven.node.TreeNode;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Code Fruit
 * @date 2021/8/5 9:45
 * @Email 126089205@qq.com
 */
public class PreorderTraversal {
    public int[] preorderTraversal1(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        node(values,root);
        int[] nums = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            nums[i] = values.get(i);
        }

        return nums;
    }


    public void node1(List<Integer> values ,TreeNode root){
        if (root == null) return;
        values.add(root.val);
        node(values,root.left);
        node(values,root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        node(values,root);
        return values;
    }

    public void node(List<Integer> values ,TreeNode root){
        if (root == null) return;
        node(values,root.left);
        values.add(root.val);
        node(values,root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        return values;
    }


    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        queue.offer(root);
        while (queue.isEmpty()){
            if (queue.peek().left != null){
                queue.offer(queue.peek().left);
            }
            if (queue.peek().right != null){
                queue.offer(queue.peek().right);
            }
            arrayList.add(queue.poll().val);
        }
        int[] nums = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            nums[i] = arrayList.get(i);
        }
        return nums;
    }

    /**
     * 堆排序
     * 构建大顶堆条件 ： nums[i] > nums[2 * i + 1] && nums[i] > nums[2 * i + 2]
     * 构建小顶堆条件 ： nums[i] < nums[2 * i + 1] && nums[i] < nums[2 * i + 2]
     * @param nums
     * @return
     */
    public int[] stackSort(int[] nums){
        return null;
    }


    @Test
    public void test2(){
        System.out.println(a());
    }
    public String a(){
        String a = "5";
        try {
            if (a.equals("5")){
               return "字符串相同";
            }else {
               return "字符串不相同";
            }
        }catch (NullPointerException e){
            a = "发生了异常";
        }finally {
            return a;
        }
    }
}
