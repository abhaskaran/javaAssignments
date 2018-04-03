package javaTest;

import java.util.Arrays;

public class ShuffleZero{
    static void moveZero(int arr[])
    {int count = 0;
     for (int i = 0; i < arr.length; i++)
        { if(arr[i] != 0)
            {arr[count] = arr[i];
                count++;
            }
        }
 
               while (count < arr.length)
        {      arr[count] = 0;
             count++;
        }
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void main(String[] args)
    {
        moveZero(new int[] {0, 1, 2, 0, 83, 0, 98});      
    }
}
