
package com.example;
import java.util.*;  

class HelloCodiva {
  
  // Source: https://techdevguide.withgoogle.com/paths/foundational/find-longest-word-in-dictionary-that-subsequence-of-given-string/#code-challenge
  
  public static void main(String[] args) {
    String s = "abppplee";
    ArrayList<String> al = new ArrayList<String>(Arrays.asList("able", "ale", "apple", "bale", "kangaroo"));
    Set<Character> hs = new HashSet<>();
    int max = 0;
    StringBuilder sb = new StringBuilder();
    
    for(int i=0; i < s.length(); i++){
      hs.add(s.charAt(i));
    }
    
    for(String str : al){
      int count = 0;
      for(int i=0; i < str.length(); i++){
        if(!hs.contains(str.charAt(i))){break;}
        else{
          count++;
        }
      }
      if(count > max){max = count; sb.setLength(0); sb.insert(0,str);}
      
    }
    
    System.out.println(sb);
  }
}

