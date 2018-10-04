# Find The Fine
# https://practice.geeksforgeeks.org/problems/find-the-fine/0/?track=Placement


import java.util.*;
import java.lang.*;
import java.io.*;

class FindTheFine {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n =sc.nextInt();
		    int date = sc.nextInt();
		    int cn[] = new int[n];
		    int p[] = new int[n];
		    for(int i = 0;i<n;i++)
		    {
		        cn[i] = sc.nextInt();
		    }
		    for(int i = 0;i<n;i++)
		    {
		        p[i] = sc.nextInt();
		    }
		    int s = 0;
		    loop : for(int i = 0;i<n;i++)
            {
                if(date%2 == 0)
                {
                    if(cn[i]%2 !=0)
                        s =s+p[i];
                    else
                        continue loop;
                }
                else
                {
                    if(cn[i] %2 == 0)
                        s=s+p[i];
                    else
                        continue loop;
                }
                    
            }
            System.out.println(s);     
		}
	}
}
