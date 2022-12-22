package codility;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
       // solution();
    }
    public String solution(int[] T) {
        int l=T.length;
        int count=l/4;


        int[] winter=new int[count];
        int[] spring=new int[count];
        int[] summer=new int[count];
        int[] autumn=new int[count];

        int[] diff=new int[4];

        int i=0,j=0,indx=0;

        for( j=0,i=0;j<count;j++,i++)
        {
                winter[i]=T[j];
        }
         for( j=count,i=0;j<count*2;j++,i++)
        {
                spring[i]=T[j];
        }
         for( j=count*2,i=0;j<count*3;j++,i++)
        {
                summer[i]=T[j];
        }
        for( j=count*3,i=0;j<count*4;j++,i++)
        {
                autumn[i]=T[j];
        }
       
        Arrays.sort(winter);
        Arrays.sort(spring);
        Arrays.sort(summer);
        Arrays.sort(autumn);

         diff[0]=winter[count-1]-winter[0];
         diff[0]=spring[count-1]-spring[0];
         diff[0]=summer[count-1]-summer[0];
         diff[0]=autumn[count-1]-autumn[0];

         int maxAmpl=diff[0];
          int index=0;
         for(int k=1;k<4;k++)
         {
            
             if(diff[k]>maxAmpl)
             {
                 maxAmpl=diff[k];
                 index=k;
             }
            
         }
        if(index==0)
        {
            return "WINTER";
        }
        else if(index==1)
        {
            return "SPRING";
        }
        else if(index==2)
        {
            return "SUMMER";
        }
        else{
            return "AUTUMN";
        }

       
    }
}
