///////////////////////////////////////////////////////////////////////////////////
//////// Take in int N, convert to binary, flip all the bits (1's = 0 and 0's = 1),
//////// return int value of flipped bits
//////// Ex: N = 10 in binary 1010 -> flip bits -> 0101 -> Answer is 5
///////////////////////////////////////////////////////////////////////////////////

public class binaryFlip {

   
    public static int flipTheBits(int N){
       
        String s = "";
        int i = (int) Math.floor(Math.log(N) / Math.log(2));
       
        while(N > 0){
            if(Math.pow(2, i) <= N){
                s += "1";
                N -= Math.pow(2, i);
            }
           
            else{
                s += "0";
            }
            i -= 1;
        }
       
        for(int x= 0; x < i + 1; x++){
            s += "0";
        }
       
        int sum = 0;
        String[] sArray = s.split("");
       
        for(int j =0 ; j < s.length(); j++){
            if(sArray[s.length() - j - 1].equals("0")){
                sum += Math.pow(2, j);
            }
        } 
        return sum;
    }
   
    public static void main(String[] args) {
        System.out.println(flipTheBits(10));
    }
   
}