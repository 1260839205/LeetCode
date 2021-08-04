package com.aguo.leetcode.fiveday.node;

import java.util.List;

/**
 * @author Code Fruit
 * @date 2021/8/2 9:27
 * @Email 126089205@qq.com
 */
public class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
}
