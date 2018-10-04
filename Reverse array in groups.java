# Reverse array in groups
# https://practice.geeksforgeeks.org/problems/reverse-array-in-groups/0/?track=Placement

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseInGroups {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- > 0) {
		    int n = s.nextInt();
		    int k = s.nextInt();
		    s.nextLine();
		    String arr[] = s.nextLine().split(" ");
		    StringBuffer sb = new StringBuffer("");
		    for(int i = 0; i < n-k; i+=k) {
		        for(int j = i+k-1; j >= i; j--) {
		           sb.append(arr[j]+ " "); 
		        }
		    }
		    for(int i = n-1; i >= (n/k)*k; i--) {
		        sb.append(arr[i]+ " ");
		    }
		    System.out.println(sb);
		}
	}
}
