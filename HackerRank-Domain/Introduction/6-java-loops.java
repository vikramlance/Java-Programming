import java.io.*;
import java.util.*;


class Main {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  //System.out.println(t);
  for (int i = 1; i <= t; i++) {

   //System.out.println(i);


   if (i == 1) {
    String id = sc.nextLine();
   }
   String az = sc.nextLine();
   //            a.split("\\s+") ;
   //            String line = value.toString();
   String[] s = az.split("\\s+");
   String m = "";
   //List < Integer > myList = new ArrayList < Integer > ();
   int a = Integer.parseInt(s[0]);
   int b = Integer.parseInt(s[1]);
   int n = Integer.parseInt(s[2]);

   /*System.out.println(a);
   System.out.println(b);
   System.out.println(n);
   2 6 14 30 62 126 254 510 1022 2046
   */

   for (int j = 0; j < n; j++) {
    //	m=m+ Integer.toString(a)+  
    int p = 0;
    for (int l = 0; l <= j; l++) {
     p = p + powerN(2, l);
     //System.out.println("p is");
     //System.out.println(p);
    }

    int k = a + p * b;
    //System.out.println("k is");
    //System.out.println(k);
    m=m+ Integer.toString(k) + " ";
    //myList.add(k);
   }

   System.out.println(m);
  }
 }

 public static int powerN(int base, int n) {
  if (n < 0) {
   throw new IllegalArgumentException("Illegal Power Argument");
  }
  if (n == 0) {
   return 1;
  } else {
   return base * powerN(base, n - 1);
  }
 }
}
