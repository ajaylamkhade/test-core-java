package javarunner.core.stringchars;

public class CalculateLengthWithoutFunctionAndLoop {
    public static void main(String[] args) {
        String str = "SAVARKAR NAGAR";
        int length=0;
        //length = calculateLengthUsingCharArray(str);
        length = calculateLengthUsingCharAt(str);

        System.out.println("length of string: "+length);
    }

    private static int calculateLengthUsingCharArray(String str){
        char nameArray [] = str.toCharArray();
        int i=0;
        for (char c : nameArray){
            i++;
        }
      return i;
    }

    private  static int calculateLengthUsingCharAt(String str){
        int i=0;
        try {
            for (i = 0; 0 <= i; i++) {
                str.charAt(i);
            }
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println(stringIndexOutOfBoundsException);
        }
        return i;
    }



}
