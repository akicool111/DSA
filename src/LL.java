import java.util.HashMap;
import java.util.Map;

public class LL {

    private int size;
    private ListNode head;
    private class ListNode
    {
       private int val;

       private ListNode next;


        ListNode()
        {
            size=0;
        }
        ListNode(int val)
        {
            this.val=val;
        }

    }
    public void insert(int val)
    {
        ListNode node =new ListNode(val);
        if(head==null)
        {
            head=node;
            return;
        }

        node.next=head;
        head=node;
        size +=1;

    }
    public void insertRec(int val,int index)
    {
        head=insertRec(val,index,head);
    }
    public ListNode insertRec(int val,int index,ListNode node)
    {
        if(index==0)
        {
            ListNode tmp=new ListNode(val);
            tmp.next=node;
            size++;
            return tmp;
        }
        node.next=insertRec(val,index-1,node.next);

        return node;
    }
    public void deleteIndex(int index)
    {
        ListNode tmp=head;
        for(int i=0;i<index-1;i++)
        {
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;

    }
    public void display()
    {
        ListNode tmp=head;
        while(tmp!=null)
        {
            System.out.print(tmp.val+" -> ");
            tmp=tmp.next;
        }
        System.out.print("END");
        System.out.println("");
    }

    public void reverse()
    {
        ListNode tmp=head;
    }
    public static void main(String[] args) {
      //  ListNode l1=new ListNode(10);


    }
    public int numIdenticalPairs(int[] nums) {

        int numberOfGoodPairs=0;

//         for(int i=0;i<nums.length;i++)
//         {
//           for(int j=i+1;j<nums.length;j++)
//           {
//               if(nums[i]==nums[j])
//               {
//                   numberOfGoodPairs +=1;
//               }
//           }
//         }
        // int[] arr=new int[nums.length];

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            if(map.containsKey(val))
            {

                map.put(val,map.get(val)+1);
            }
            else
            {
                map.put(val,1);
            }
        }

        for(int i: map.values())
        {
            numberOfGoodPairs=numberOfGoodPairs+i*(i-1)/2;
        }
        return numberOfGoodPairs;
    }

}
