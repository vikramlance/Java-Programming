import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.print(A.length() + B.length());
        System.out.print("\n");
        if (A.compareTo( B ) >0 )   {System.out.print("Yes");}
        else {System.out.print("No");}
        System.out.print("\n");        
        String cap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String cap1 = B.substring(0, 1).toUpperCase() + B.substring(1);
       // System.out.print (WordUtils.capitalize(A) + WordUtils.capitalize(B) );
        System.out.print (cap+" "+cap1 );
    }
}
