package javarunner.core.string;

public class TestParseStringLong {
    public static void main(String[] args) {
        String issuerId="6029";
        String returnIssuerId;
        returnIssuerId= findByIssuerId(Long.valueOf(issuerId));
        System.out.println("returnIssuerId: "+returnIssuerId);

    }

    private static String findByIssuerId(long issuerId){

        return String.valueOf(issuerId);
    }
}
