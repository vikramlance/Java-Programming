import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String result="Yes";
        
        
 //       if (A.length() %2 ==0) {
            for (int i=0; i<((A.length()/2) ); i++)
                
             { 
                         	
             	if ( !( (A.substring(i,i+1)).equals(A.substring(A.length() -i -1,A.length()-i)) ) ) {
                result="No" ;
                 break; 
            }
            }  
            
 //       }
  
   /*     else { 
            
             for (int j=0; j<((A.length()/2) ); j++)
                
             { if (A.substring(j,j+1)!= A.substring(A.length() -j -1,A.length()-j)) {
                result="No" ;
            }
            } 
     */       
                System.out.print (result);    
        }
    }
