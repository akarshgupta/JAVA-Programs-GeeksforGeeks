# Reverse an Array 
# https://practice.geeksforgeeks.org/problems/reverse-an-array/0/?track=Placement


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            StringBuffer b = new StringBuffer("");
            for(int i = 0;i<n;i++)
            {
                arr[i]= sc.nextInt();
                  
            }
            for(int i = 0;i<n;i++)
                b.insert(0,arr[i] + " ");
            System.out.println(b);
        }
	}
}
