package binarytree;

import sun.reflect.generics.tree.Tree;

public class Height {

    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode()
        {

        }
        public TreeNode(int val)
        {
            this.val=val;
        }
    }
    public static void main(String[] args) {

    }
    //height
    public int maxDepth(TreeNode root)
    {
      if(root==null)
      {
          return 0;
      }

      int lefth=maxDepth(root.left);
      int righth=maxDepth(root.right);

      return 1+Math.max(lefth,righth);
    }
}
