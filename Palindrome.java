/** 
  *Author: Fernando Rosa
  *Date: 02/10/2021
  *Hours: 15 Hours
  *Class: CSCI - U200
  *Assignment: Program 1
  *Description: This program test if a list of Strings are Palindromes
*/


import java.util.Scanner;

public class Palindrome {
  

  public static boolean isPalindrome(String s) {
    
    //these operations takes the strings passed to isPalindrome and removes the specified characters.
    s = s.replace(" " , "");
    s = s.replace("," , "");
    s = s.replace("." , "");
    s = s.replace("?" , "");
    //creates a StringBuilder Object.
    StringBuilder sb = new StringBuilder(s);
    //creates a new string that is the reverse of the string s
    sb.reverse();
    return s.equalsIgnoreCase(sb.toString());
    
  }

  public static void main(String[] args) {
    
    //Defines a scanner object to read from System.in
    Scanner scanner = new Scanner(System.in);
    //Defines a string called line and reads the first line from the scanner object
    String line = scanner.nextLine();
    //keeps reading lines until the word QUIT is read
    while (!line.equals("QUIT")) {
         //calls the isPalindrome method passing it the line
        //based on what this method returns, it will output a message (IS or IS NOT)
        if (isPalindrome(line)){
            System.out.println("the string [" + line + "] IS a palindrome.");
        }else{
          System.out.println("the string [" + line + "] IS NOT a palindrome.");
        }
        //reads the next string
        line = scanner.nextLine();
        
      }
  }
}
