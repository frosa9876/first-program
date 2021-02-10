// Author: Fernando Rosa
// Date: 02/05/2021
// Hours: 15 Hours
// Class: CSCI - U200
// Assignment: Program 1


import java.util.Scanner;

public class Palindrome {
  

  public static boolean isPalindrome(String s) {
    
    s = s.replace(" ", "");
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    return s.equalsIgnoreCase(sb.toString());
    
  }

  
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    System.out.println(line);
    
    while (!line.equals("QUIT")) {
        if (isPalindrome(line)){
            System.out.println("the string [" + line + "] IS a palindrome.");
        }else{
          System.out.println("the string [" + line + "] IS NOT a palindrome.");
        }
        
        line = scanner.nextLine();
        
      }
  }
}
