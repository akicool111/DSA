package binarytree;

public class DiamaterOfBTree {

    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(TreeNode left,TreeNode right)
        {
            this.left=left;
            this.right=right;
        }
    }
    public class TreeData
    {
        int ht;
        int dia;
        public TreeData(int ht,int dia)
        {
            this.ht=ht;
            this.dia=dia;
        }
    }
    public static void main(String[] args) {

    }
    public int diamater(TreeNode root)
    {
           return 0;
    }
    public TreeData dfs(TreeNode root)
    {
        if(root==null)
        {
            return new TreeData(0,0);
        }

        TreeData left=dfs(root.left);
        TreeData right=dfs(root.right);

        int diam=1+left.ht+right.ht;

        return new TreeData(Math.max(left.ht,right.ht)+1,Math.max(diam,Math.max(left.dia, right.dia)));
    }

}
