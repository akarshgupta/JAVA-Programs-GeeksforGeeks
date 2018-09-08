# 
Search an Element in an array 
# https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array/0/?track=Placement


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0 ; i < t ; i++)
		{
		    int n =sc.nextInt();
		    int arr[] = new int[n];
		    for(int k = 0 ; k< n ;k++)
		        arr[k] = sc.nextInt();
		    int s =sc.nextInt();
		    for(int j = 0;j<n;j++)
		    {
		        if(arr[j] == s)
		        {
		            System.out.println(j);
		            break;
		        }
		        if(j == n-1 && arr[j]!= s)
		            System.out.println("-1");
		    }
		}
	}
}
