//Find the closest number
//https://practice.geeksforgeeks.org/problems/find-the-closest-number/0/?track=Placement

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int ind = 0;
            
            int arr[] = new int[n];
            int arr2[] = new int[n];
            int k = sc.nextInt();
            for(int i = 0; i < n; i++)
                arr[i]= sc.nextInt();
            for(int i = 0;i<n;i++)
                arr2[i] =Math.abs(k-arr[i]);
            
            int min = arr2[0];
            for(int i = 1;i<n;i++)
            {
                if(arr2[i]<= min){
                    min = arr2[i];
                    ind = i;
                }
            }           
            System.out.println(arr[ind]);
        }
            
	}
}
