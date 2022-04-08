package javarunner.core.onlinetest;

public class Solution {


    public static void main(String [] args) {
        int[] A = {0,1,2,2,3,3};
        int K=3;
        boolean value = new Solution().solution(A, K);
        System.out.println("value is " +value);

    }

    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 && A[n - 1] != K  )
            return false;
        else
            return true;
    }

}

