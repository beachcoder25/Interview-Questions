public class URLify {

    public static char[] replaceSpaces(char[] str, int trueLength){
        // We use trueLength to cut the spaces off at the end (nice little trick)
        System.out.println("Length of char array without spaces (Inside method): " + trueLength);
        
        int spaceCount = 0, index, i =0;

        for(i=0; i < trueLength; i++){
            if(str[i] == ' '){ spaceCount++;} 
        }

        index = trueLength + spaceCount * 2;

        // Had to use a new array to overcome index out of bounds error I was getting because index is outside the range of str which makes sense
        char[] retArray = new char[index];
        System.out.println("(index = trueLength + spaceCount * 2) == " + index);

        if(trueLength < retArray.length) retArray[trueLength] = '\0'; // End Array

        for(i = trueLength - 1; i >= 0; i--){
            if(str[i] == ' '){
                //System.out.println( str[index - 1] + "\n" + str[index - 2] + "\n" + str[index - 3] + "\n" + "index = " + index +  "- 3 = " + index); 
                retArray[index - 1] = '0';
                retArray[index - 2] = '2';
                retArray[index - 3] = '%';
                index = index - 3;
                
            } else {
                //Index out of bounds error (Got this when I drew by hand too) // CHECK SOLUTION ABOVE !!!!
                //System.out.println("Index: " + (index - 1));
                
                retArray[index - 1] = str[i];
                index--;
            }
        }



        return retArray;
    }

    

    public static void main(String[] args){

        String string = "Mr John Smith  ";
        char[] str = string.toCharArray();
        System.out.println("Length of char array with spaces: " + str.length);
        char[] ret = replaceSpaces(str, 13);

        System.out.println();
        for(char c : ret){System.out.print(c);}
        //
    }
}