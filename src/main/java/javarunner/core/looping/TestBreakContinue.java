package javarunner.core.looping;

public class TestBreakContinue {

    public static void main(String[] args) {

        for (int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                if (j==3){
                    continue;
                }
                System.out.println(j);
            }
        }

    }

}
