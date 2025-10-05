package Assignment;

import java.util.Arrays;

public class second_maximum_number_inarray
{
    public static void main(String[] args) {
        int[] a= {1, 7, 3, 9, 2};
        int l=a.length;
        int temp;
        System.out.println("before sorting:"+ Arrays.toString(a));

        for(int i=0 ; i<l-1; i++) // number of passess
        {
            for(int j=0; j<l-1;j++) // number of passes in each iteration
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            }
        System.out.println("After sorting:"+ Arrays.toString(a));
        System.out.println("second highest number in an array is:"+a[l-2]);
    }
}
