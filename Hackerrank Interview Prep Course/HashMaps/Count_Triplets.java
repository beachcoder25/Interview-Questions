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
        HashMap<Long, Integer> hmB = new HashMap<>();
        HashMap<Long, Integer> hmA = new HashMap<>();
        int rightCount=0;
        int leftCount=0;

        long sum= 0;
        long curr;

        for(long n: arr){
            if(hmB.containsKey(n)){ 
                hmB.put(n, hmB.get(n)+1); 
            }

            else{hmB.put(n,1);}
        }

        for(int i=0; i< arr.size(); i++){
            curr = arr.get(i);

            // Update hmA
            if(hmA.containsKey(curr)){ 
                hmA.put(curr, hmA.get(curr)+1); 
            }

            else{hmA.put(curr,1);}

            // Check hmB

            
            

            if(hmA.containsKey(curr/r) && hmB.containsKey(curr*r) && curr%r == 0){
                System.out.println("Curr: " + curr);
                System.out.println("hmA: " + hmA.get(curr) + " hmB: " + hmB.get(curr));
                sum += (hmA.get(curr/r)*hmB.get(curr*r));
                if(hmB.get(curr) == 0){ hmB.remove(curr);}
                else{ hmB.put(curr, hmB.get(curr)-1); }
            }

            
        }

        //if(hm.containsKey((long)9)){System.out.println(hm.get((long)9));}

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

