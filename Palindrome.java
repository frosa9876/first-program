// use the same header comments you've used in chapter 1 and chapter 2 program assignments

import java.util.*;

public class Palindrome {
  //
  // method: isPalindrome
  // pre-conditions: a string is passed in
  // post-conditions: return true if the string is a palindrome otherwise return false
  //
  public static Boolean isPalindrome(String s){
      stringBuilder sb = new StringBuilder(str);
    sb.reverse();
    string rev = sb.toString();
    if(str.equals(rev)){
      return true;
    
    }else{
      return false;
    
    }
    
    }
  }

  public static void main(String[] args) {
      // define a scanner object to read from System.in
     //
    Scanner.scan = new Scanner(new file);
      // define a string called word and read the first line from the scanner object
     //
    word w = new word(new file)
      // keep reading words until the word QUIT is read in
     //
      while (!word.equals("QUIT")) {
        //
        // call the isPalindrome method passing it the word
       //
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return str.trim().equalsIgnoreCase(new StringBuilder(str.trim()).reverse().toString() );
        // based on what this method returns (true or false) output a message
        //
        if (isPalindrome(word))
            System.out.println("the string [" + word + "] IS a palindrome.");
        else
        // provide false branch
          System.out.println("the string [" + word + "] IS NOT a palindrome.");
           
        
        // read the next string
        
      }
  }
}
