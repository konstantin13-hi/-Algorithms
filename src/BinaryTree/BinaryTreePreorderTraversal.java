package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {




      public static class TreeNode {
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

    public static List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        if (root!=null){
            linkedList.addFirst(root);

        }
        while (!linkedList.isEmpty()){
            TreeNode treeNode = linkedList.pop();
            list.add(treeNode.val);
            if(treeNode.right!=null){
                linkedList.addFirst(treeNode.right);
            }
            if(treeNode.left!=null){
                linkedList.addFirst(treeNode.left);
            }


        }



          return list;

    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.left.right.right = new TreeNode(5);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        System.out.println(Arrays.toString(preorderTraversal(root).toArray()));

    }

}
