package javarunner.core.stringchars;

public class TestEnum {

    public static void main(String[] args) {
        for(UnBlockReason unblockReason : UnBlockReason.values()) {
            //System.out.println(unblockReason);
            if (unblockReason.name().equals("FALSE_POSITIVE")){
                System.out.println("FALSE_POSITIVE");
            }
        }
    }
}
