package arrays;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};

        arr=  flipAndInvertImage(arr);


        for(int[] sarr : arr)
        {
            System.out.print(Arrays.toString(sarr));
        }



    }
    public  static int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length/2;j++)
            {
                int tmp=image[i][j];
                image[i][j]=image[i][image[i].length-j-1];
                image[i][image[i].length-j-1]=tmp;
            }

        }


        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                int tmp=image[i][j];

                if(tmp==1)
                {
                    image[i][j]=0;
                }
                else
                {
                    image[i][j]=1;
                }
            }

        }

        return image;
    }


}
