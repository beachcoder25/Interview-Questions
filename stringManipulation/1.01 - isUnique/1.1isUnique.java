import java.util.*;  

class Main {

  public static void main(String[] args) {
    System.out.println(isUnique("sstring"));
    System.out.println(isUnique("string"));
  }

  public static boolean isUnique(String s){

    HashSet<Character> hashSet= new HashSet<Character>();

    for(int i=0; i < s.length(); i++){

      if(!hashSet.contains(s.charAt(i))){hashSet.add(s.charAt(i));}
      else{ return false;}
    }
    return true;
  } 
  
}