# Rotating an Array 
#https://practice.geeksforgeeks.org/problems/reversal-algorithm/0


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1;i <= t; i++)
		{
		    int n =sc.nextInt();
		    int[] ser = new int[n];
		    for(int j = 0;j < n;j++)
		    {
		       ser[j] = sc.nextInt();
		    }
		    int c = sc.nextInt();
		    for(int k = c; k < n ; k++)
		        System.out.print(ser[k]+" ");
		    for(int l = 0; l < c; l++)
		        System.out.print(ser[l]+" ");
		        System.out.println();
	}}
}
