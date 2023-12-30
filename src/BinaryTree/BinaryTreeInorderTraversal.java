package BinaryTree;

import java.util.*;

public class BinaryTreeInorderTraversal {

      public  static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            list.add(root.val);
            root = root.right;

        }

        return list;
    }


    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
       root.right.left = new TreeNode(3);

        // Дерево выглядит примерно так:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        System.out.println(Arrays.toString(inorderTraversal(root).toArray()));
    }


}
