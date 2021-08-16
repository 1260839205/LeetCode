package com.aguo.leetcode.seven.node;

/**
 * @author Code Fruit
 * @date 2021/8/5 9:43
 * @Email 126089205@qq.com
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
