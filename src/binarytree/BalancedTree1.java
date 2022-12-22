package binarytree;

public class BalancedTree1 {

    public class TreeNode
    {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val)
        {
            this.val=val;
        }
    }

    public class TreeData
    {
        int ht;
        boolean flg;

        TreeData(int ht,boolean flg)
        {
            this.ht=ht;
            this.flg=flg;
        }
    }
    public static void main(String[] args) {

    }

    public  boolean isBalanced(TreeNode root)
    {
        return dfs(root).flg;
    }

    public  TreeData dfs(TreeNode root)
    {
        if(root==null)
        {
            return new TreeData(0,true);
        }

        TreeData left=dfs(root.left);
        TreeData right=dfs(root.right);

        boolean isbalance=Math.abs(left.ht-right.ht)<=1 && left.flg && right.flg;

        return new TreeData(Math.max(left.ht,right.ht)+1,isbalance);
    }



}
