package binaryCounting;

import static java.lang.Integer.parseInt;

/**
 *
 * @author Jonah
 */
public class binaryCounter {

    public static void main(String[] args) {
        binaryCounter cClass = new binaryCounter();

        String binary = "101011";
        System.out.println(cClass.countBinary(binary));
    }

    public int countBinary(String stringNumber) {
        
        double doubleNumber = 0;
        String s = "";
        int n = 0;
        int i = 0;
        for (i = 0; i < stringNumber.length(); i++) {

            if (i != stringNumber.length() - 1) {

                s = Character.toString(stringNumber.charAt(i));
                n = parseInt(s);

                if (n == 1) {
                    doubleNumber += Math.pow(2, stringNumber.length() - 1 - i);
                }
            }
            
            // Special case for last digit being counted
            else{
                s = Character.toString(stringNumber.charAt(i));
                n = parseInt(s);
                if(n == 1){
                    doubleNumber += 1;
                }
            }
        }
        return (int) doubleNumber;
    }

}
