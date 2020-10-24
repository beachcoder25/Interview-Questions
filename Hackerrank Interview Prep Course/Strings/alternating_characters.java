import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        char prev, curr;
        StringBuilder sb = new StringBuilder();
        
        if(s.length() > 0){
            
            sb.append(s.charAt(0));

            for(int i=1; i < s.length();i++){

                prev = s.charAt(i-1);
                curr = s.charAt(i);

                if(curr != prev){
                    sb.append(curr);
                }
            }


        }else{ return 0;}

        
        return s.length() - sb.length();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

