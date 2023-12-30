package BinaryTree;

import java.util.*;

public class BinaryTreePostorderTraversal {


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

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        if(root!=null){
            linkedList.add(root);
        }
        while (!linkedList.isEmpty()){
           TreeNode treeNode =  linkedList.removeLast();
           list.add(treeNode.val);
           if(treeNode.left!=null){
               linkedList.addLast(treeNode.left);
           }
            if(treeNode.right!=null){
                linkedList.addLast(treeNode.right);
            }
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        System.out.println(Arrays.toString(postorderTraversal(root).toArray()));


    }
}
