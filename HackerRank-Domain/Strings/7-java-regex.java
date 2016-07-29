import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}


public static void regexChecker(String theRegex, String str2Check){

// You define your regular expression (REGEX) using Pattern

Pattern checkRegex = Pattern.compile(theRegex);

// Creates a Matcher object that searches the String for

// anything that matches the REGEX



Matcher regexMatcher = checkRegex.matcher( str2Check );



// Cycle through the positive matches and print them to screen

// Make sure string isn't empty and trim off any whitespace



while ( regexMatcher.find() ){

if (regexMatcher.group().length() != 0){

System.out.println( regexMatcher.group().trim() );



// You can get the starting and ending indexs



//System.out.println( "Start Index: " + regexMatcher.start());
//System.out.println( "Start Index: " + regexMatcher.end());

}

}



System.out.println();

}
