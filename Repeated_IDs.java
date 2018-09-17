// Repeated I.Ds
// https://practice.geeksforgeeks.org/problems/repeated-ids/0/?track=Placement


import java.util.*;
import java.io.*;
class Repeated_IDs {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i< n; i++)
				arr[i] = sc.nextInt();
			StringBuffer s = new StringBuffer("");
			outer: for(int i = 0; i< n-1; i++)
			{
				inner:for(int j = i+1;j < n ; j++)
				{
					if(arr[i] == -1)
						continue outer;
					if(arr[i] == arr[j])
					{
						arr[j] = -1;
					}
				}
			}
			for(int i = 0; i< n; i++)
			{
				if(arr[i] != -1)
					s.append(arr[i] + " ");
			}
			System.out.println(s);
		}
	}
}
