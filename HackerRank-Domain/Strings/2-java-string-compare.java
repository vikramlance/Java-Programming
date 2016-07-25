import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        String a= s.next();
        int k= s.nextInt();
        String max, min;
        max= min= a.substring(0,k) ;
        String m ="";
        
        for (int i=0; i<(a.length() - k +1); i++)
            { m = a.substring(i,i+k);
             
        if (m.compareTo( min ) < 0 )   {min=m;}
          
        if (m.compareTo( max ) > 0 )   {max=m;}
     
        }
        
                System.out.print (min +"\n"+max);
    }
}
