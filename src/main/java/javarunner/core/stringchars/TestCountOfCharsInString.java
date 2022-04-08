package javarunner.core.stringchars;

/**
 * Find the count of characters in string
 */
public class TestCountOfCharsInString {

    static String wordString ="MAHABALESHWAR";

    public static void main(String[] args) {
        char  []  wordStringArray = wordString.toCharArray();
        char characterInString;
        int counter=0;
        char tempArray [] = new char[wordStringArray.length];

        for(int i=0; i<wordString.length();i++){
            characterInString = wordStringArray[i];
            counter=0;
            for (int j=0;j<wordString.length();j++){
                if(characterInString==wordStringArray[j]){
                    counter++;

                }
            }
           System.out.println("Character name: "+characterInString+ " count: "+counter);
        }

    }
}
