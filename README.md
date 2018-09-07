# JAVA-Programs-GeeksforGeeks
//Geeks for Geeks programms
/*Write a program to input a list of n integers in an array and arrange them in a way similar to the to-and-fro movement of a Pendulum.

    The minimum element out of the list of integers, must come in center position of array. If there are even elements, then minimum element should be moved to (n-1)/2 index (considering that indexes start from 0)
    The next number (next to minimum) in the ascending order, goes to the right, the next to next number goes to the left of minimum number and it continues like a Pendulum.
*/
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
