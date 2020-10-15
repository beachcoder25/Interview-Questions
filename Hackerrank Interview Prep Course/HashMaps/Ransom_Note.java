import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> hs = new HashMap<>(); 
        for(int i=0; i < magazine.length; i++){
            if(!hs.containsKey(magazine[i])){hs.put(magazine[i], 1);}
            else{
                hs.put(magazine[i], hs.get(magazine[i])+1);
            }
        }

        for(int i=0; i < note.length; i++){

            if(!hs.containsKey(note[i])){
                System.out.println("No");
                return;
            }
        
            if(hs.containsKey(note[i])){
                if(hs.get(note[i]) - 1 < 0){
                    System.out.println("No");
                    return;
                }
                hs.put(note[i], hs.get(note[i]) - 1);
            }
        }
        System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

