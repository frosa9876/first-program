// Author: Fernando Rosa
// Date: 02/05/2021
// Hours: 15 Hours
// Class: CSCI - U200
// Assignment: Program 1


import java.util.*;

public class Palindrome {
  

  public static Boolean isPalindrome(String s){
    
    s=s.replaceAll("[^a-zA-Z0-9]", "");
    String Str = new String();
    stringBuilder sb = new StringBuilder(str);
    sb.reverse();
    string rev = sb.toString();
    
    if(str.equals(rev))
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args) {
  
    Scanner scan = new Scanner("testA.txt");
    String word = new String();
    word = scan.nextLine();
    
      while (!word.equals("QUIT")){
        
        if (isPalindrome(word)== true){
            System.out.println("the string [" + word + "] IS a palindrome.");
        }
        else{
          
          System.out.println("the string [" + word + "] IS NOT a palindrome.");
        }
        
        word = scan.nextLine();
        
      }
  }
}
