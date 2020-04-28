import java.util.Arrays;

public class permutation {

    public static boolean isPerm(String a, String b){
        
        // If strings are not equal length, cant be permutation (Unless we consider white spaces)
        if(a.length() != b.length()){ 
            System.out.println("Strings aint same length"); 
            return false;
        }
        
        // Convert strings to char arrays for sorting
            // Space usage concern

        char[] cA = a.toCharArray();
        char[] cB = b.toCharArray();

        // Generic built-in sorts
        Arrays.sort(cA);
        Arrays.sort(cB);

        // Check for equality of characters, since sorted should always be equal
        for(int i=0; i < a.length(); i++){
            if(cA[i] != cB[i]){ return false;}
        }

        return true;
    }

    public static void main(String[] args){

        System.out.println(isPerm("eat", "ate") + "\n");
        System.out.println(isPerm("eats", "ate")+ "\n");
    }
}