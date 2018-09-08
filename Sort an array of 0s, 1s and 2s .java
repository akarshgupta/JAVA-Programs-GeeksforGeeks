#Sort an array of 0s, 1s and 2s 
#https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0/?track=Placement

import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0)
		{
		    int c0=0,c1=0,c2=0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i< n; i ++)
		         arr[i] = sc.nextInt();
		    for(int i = 0;i<n;i++)
		    {
		        if(arr[i] == 0)
		            c0++;
		        if(arr[i] == 1)
		            c1++;
                if(arr[i] == 2)
		            c2++;
		    }
		    StringBuffer sb = new StringBuffer("");
		    for(int i = 0; i<c0;i++)
		        sb.append("0 ");
		    for(int j = c0; j< (c0+c1);j++)
		        sb.append("1 ");
		    for(int k = (c0+c1); k < n; k++)
		        sb.append("2 ");
		    //for(int h = 0; h < n; h++)
		      //  System.out.print(arr2[h] + " ");
		        System.out.println(sb);
		}
	}
}
