package javaTest;

import java.util.Arrays;

public class DelDup 
{   
    static void remDup(int[] a)
    {
        System.out.println("Array With Duplicates : ");       
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
           int UniquCount = a.length;
              for (int i = 0; i < UniquCount; i++) 
        {     for (int j = i+1; j < UniquCount; j++)
            {  if(a[i] == a[j])
                {a[j] = a[UniquCount-1];                
                	UniquCount--;
                    j--;
                }
            }
        }
      
        int[] res = Arrays.copyOf(a, UniquCount);        
        System.out.println();        
        System.out.println("Array Without Duplicates : ");  
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+"\t");
        }  
        System.out.println();       
        System.out.println("==============================");
    }
     
    public static void main(String[] args) 
    {        
    	remDup(new int[] {1,2,2,3,4,3,4,5});
    
    }    
}
