package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {


    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class BinaryTree
    {
        static int idx=-1;
        public static Node buildTree(int[] nodes)
        {
             idx++;
           if(nodes[idx] == -1)
           {
               return null;
           }
           Node newNode=new Node(nodes[idx]);
           newNode.left=buildTree(nodes);
           newNode.right=buildTree(nodes);

           return newNode;
        }

        public static void preorder(Node root)
        {
            if(root==null)
            {
               // System.out.print("-1 ");
                return;

            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        }
        public static void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void  levelOrder(Node root)
        {
            Queue<Node> queue=new LinkedList<>();

            queue.add(root);
            queue.add(null);


            while(!queue.isEmpty())
            {
                Node current=queue.remove();

                if(current==null)
                {
                    System.out.println();
                    if(queue.isEmpty())
                    {
                       break;
                    }
                    else
                    {
                        queue.add(null);
                    }
                }
                else
                {
                   System.out.print(current.data+" ");

                   if(current.left !=null)
                   {
                       queue.add(current.left);
                   }
                   if(current.right!=null)
                   {
                       queue.add(current.right);
                   }
                }
            }
        }
    }
    public static void main(String[] args) {
      int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();

       Node root= tree.buildTree(nodes);

       System.out.println(root.data);
      //  BinaryTree.preorder(root);
      //  System.out.println();
      //  BinaryTree.inorder(root);
      //  System.out.println();
      //  BinaryTree.postorder(root);
        BinaryTree.levelOrder(root);
    }
}
