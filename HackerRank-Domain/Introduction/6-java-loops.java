import java.io.*;
import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
    
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(t);
        for (int i=1;i<t;i++) {

        System.out.println(i);
            
            
            if (i==1) { String id = sc.nextLine();}
            String az= sc.nextLine();
//            a.split("\\s+") ;
//            String line = value.toString();
String[] s = az.split("\\s+");
String m="";
List<Integer> myList = new ArrayList<Integer>();
int a = Integer.parseInt(s[0]);
int b= Integer.parseInt(s[1]);
int n = Integer.parseInt(s[2]);

for (int j=0;j<n;j++) {
//	m=m+ Integer.toString(a)+  
int p=0;
for (int l=0 ; l<n;l++)
{
 Double y = Math.pow(Double 2, Double(l));}
p 
int k= a +  p*b;
 	myList.add(k);
}
          
           System.out.println( myList);
        }
  }
}
