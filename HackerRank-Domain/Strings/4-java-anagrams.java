import java.io.*;
import java.util.*;

public class Solution {

  static boolean isAnagram(String x, String y) {
        
        // Complete the function by writing your code here.
        

            
           
             
            
                if (x.length() != y.length()) {
   return false;
  }   
       else      {  
           x=x.toLowerCase();
               y=y.toLowerCase();
           
        char[] chars = x.toCharArray();
        Arrays.sort(chars);
                char[] char1 = y.toCharArray();
                Arrays.sort(char1);
        String sorted = new String(chars);
                String sorted1 = new String(char1);
           
           
           
           
          // System.out.print(sorted);
           
            //System.out.print(sorted1);
           if  (sorted.equalsIgnoreCase(sorted1 ) ) {return true;}
           else    {return false; }
                
   /*         for (int i=0; i<(x.length() ); i++)
                
             { 
                         	
             	if ( !( (sorted.substring(i,i+1)).equalsIgnoreCase(sorted1.substring(i,i+1) ) )) {
                return false ;
                  
            }
            }   */
       
                //return true;
       
       }  
                // System.out.println(sorted); 
                
            }
            
            
                public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
