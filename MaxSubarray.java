# MaxSubarray
# https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0/?track=Placement

import java.util.*;
import java.io.*;
class MaxSubarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int s = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0;i < n;i++)
				a[i] = sc.nextInt();
			StringBuffer sb = new StringBuffer("");
			for(int i = 0;i< (n-s+1) ;i++)  //number of times loop will run
			{
			    int max = a[i];
			    for(int j = i;j<(i+s);j++) //Finding the maximum
			    {
			        if(max<a[j])
			            max = a[j];
			    }
			    sb = sb.append(max+" ");
			}
			System.out.println(sb);
		}
	}
}
