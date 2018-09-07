// https://practice.geeksforgeeks.org/problems/transform-to-prime/0

import java.util.*;
import java.math.*;

class GFG {
    
    boolean prime(int a)
    {
        if ( a > 2 && a%2 == 0 ) {
            return false;
        }
        int c = 0;
        int sqrt = (int)Math.sqrt(a) + 1;
        for(int i = 3; i < sqrt; i+=2)
        {
            if(a % i == 0) {
                c = 1;
                break;
            }
        }
        if(c == 0)
            return true;
        else
            return false;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        GFG gg = new GFG();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int s = 0;
            for(int i = 0; i < n; i++)
            {
                arr[i]= sc.nextInt();
                s = s+ arr[i];
            }
            if(gg.prime(s)){
                System.out.println("0");
                continue;
            }
            int u = 1;
            while(true)
            {
                if(gg.prime(s+u)){
                    System.out.println(u);
                    break;
                }
                u++;
            }
    }
}
}
