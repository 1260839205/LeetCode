package com.aguo.leetcode.fiveday.node;

/**
 * @author Code Fruit
 * @date 2021/8/2 9:29
 * @Email 126089205@qq.com
 */
public class NodeSolution {
    public int maxDepth(Node root) {
        System.out.println(root.val);
        int i = 1,max = i;
        for (Node child : root.children) {
            maxDepth(child);

        }
        max = max > i ? max : i;
        return max;
    }
}
