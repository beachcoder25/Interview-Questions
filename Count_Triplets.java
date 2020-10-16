import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Long> hmLeft = new HashMap<>();
        HashMap<Long, Long> hmRight = new HashMap<>();

        for(long n: arr){
            // Inserts element if doesn't already exist
                // Increments value by 1 if already exists
            hmRight.put(n, hmRight.getOrDefault(n, 0L) + 1);
        }

        long sum= 0;

        for(int i=0; i< arr.size(); i++){
            long mid = arr.get(i);

            // Decrement mid value in right hm by 1 since we move it to hmLeft
            hmRight.put(mid, hmRight.get(mid)-1);

            // Check if hmLeft contains the correct smalles value
                // For hmRight same logic
                // Must make sure mid%r == 0, say r =3, and the list has [5,25,125]
            if(hmLeft.containsKey(mid/r) && hmRight.containsKey(mid*r) && mid%r == 0){
                sum += hmLeft.get(mid/r)*hmRight.get(mid*r);
            }

            // Insert/Update hmLeft with the current mid value
            hmLeft.put(mid, hmLeft.getOrDefault(mid, 0L) +1);    
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

