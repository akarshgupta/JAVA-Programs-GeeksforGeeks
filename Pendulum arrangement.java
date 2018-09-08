# Print an array in Pendulum Arrangement 
#https://practice.geeksforgeeks.org/problems/print-an-array-in-pendulum-arrangement/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!= 0)
        {
            int n = sc.nextInt();
            int arr[] =new int[n];
            for(int i =0;i<n;i++)
                arr[i] = sc.nextInt();
            for(int i = 0;i<(n-1);i++)
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]<arr[i])
                    {
                        int p =arr[j];
                        arr[j] = arr[i];
                        arr[i]=p;
                    }
                }
            StringBuffer s= new StringBuffer("");
            s.insert(0,arr[0]);
            for(int z =1;z<n;z++)
            {
                if(z%2 == 0)
                    s.insert(0,arr[z] + " ");
                    
                else
                    s.append(" "+arr[z]);
            }
            System.out.println(s);
        }
    }
}
