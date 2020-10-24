import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        
        // Make 2 arrays that will act as hashMaps for each string
        int[] aMap = new int[26];
        int[] bMap = new int[26];
        int num_remove = 0;

        // Use ascii subtraction to increment the index of each letter in our map
            // to record the frequency of each letter

        // Fill aMap
        for(int i=0; i < a.length(); i++){
            aMap[a.charAt(i)-'a'] += 1; 
        }
        
        // Fill bMap
        for(int i=0; i < b.length(); i++){
            bMap[b.charAt(i)-'a'] += 1; 
        }

        // Record the difference in frequencies
        for(int i=0; i < 26; i++){
            num_remove += Math.abs(aMap[i] - bMap[i]);
        }

        return num_remove;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

