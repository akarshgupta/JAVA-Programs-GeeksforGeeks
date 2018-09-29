# Chocolate Distribution Problem
# https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0/?track=Placement


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    //input values
		    for(int i = 0;i<n;i++)
		        arr[i] = sc.nextInt();
		    int m = sc.nextInt();
		    //Sorting in ascending order
		    for (int j = 1; j < n; j++) 
		    {  
                int key = arr[j];  
                int i = j-1;  
                while ( (i > -1) && ( arr [i] > key ) ) 
                {  
                    arr [i+1] = arr [i];  
                    i--;  
                }  
                arr[i+1] = key;  
            }  
		    int min=arr[n-1];
		    for(int i =0;i < (n-m+1);i++)
		    {
		        if((arr[i+m-1]-arr[i]) < min)
		            min = arr[i+m-1]-arr[i];
		    }
		    System.out.println(min);    
		}
	}
}
