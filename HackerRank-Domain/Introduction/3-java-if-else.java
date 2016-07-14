import java.util.*;

public class solution {

 public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  int a = scan.nextInt();
  String ans = "";
  if (a % 2 != 0) {
   ans = "Weird";
  } else {
   if ((2 <= a) && (a <= 5))

   {
    ans = "Not Weird";
   } else {
    if ((6 <= a) && (a <= 20)) {
     ans = "Weird";
    } else {
     if (a > 20) {
      ans = "Not Weird";
     } else {

     }
    }

   }


  }

  System.out.println(ans);

 }


}
