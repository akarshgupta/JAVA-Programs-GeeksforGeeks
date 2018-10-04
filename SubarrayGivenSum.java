# https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0/?track=Placement
# SubarrayGivenSum

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SubarrayGivenSum{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int sum = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i < n;i++)
				arr[i] = sc.nextInt();
			int strt = -1,end = -1,s = 0;
			outer : for(int j = 0;j<n;j++)
			{
			    s = 0;
			    inner : for(int k = j;k < n; k++)
			    {
			        s = s+arr[k];
			        if(s == sum)
			        {
			         strt = j;
			         end = k;
			         break outer;
			        }
			        else if(s > sum)
			            continue outer;
			    }
			 }
			    if(s == sum)
			        System.out.println((strt+1) + " " + (end+1));
			    else
			        System.out.println("-1");
    	}
    }
}
