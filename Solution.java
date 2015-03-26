import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   static int lonelyinteger(int[] a) {
       Arrays.sort(a);
       int res = 0;
       
       if (a.length == 1) {
           res = a[0];
       } else {
           for (int i = 1; i < a.length; i++) {
               if (i == a.length - 1)
                   res = a[i];
               else if ((a[i] != a[i - 1]) && (a[i] != a[i + 1])) {
                   res = a[i];
                   break;
               }
           }
       }   
       return res;
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
