package javarunner.core.onlinetest;

public class TestOnline {



        // Function that returns true
        // if it possible to form a
        // team with the given n and m
        static boolean canFormTeam(int n, int m)
        {

            // 1 person of Type1 and 2 persons
            // of Type2 can be chosen
            if (n >= 1 && m >= 2)
                return true;

            // 1 person of Type2 and 2 persons
            // of Type1 can be chosen
            if (m >= 1 && n >= 2)
                return true;

            // Cannot from a team
            return false;
        }

        // Function to return the maximum
        // number of teams that can be formed
        static int maxTeams(int n, int m)
        {
            // To store the required count
            // of teams formed
            int count = 0;

            while (canFormTeam(n, m))
            {
                if (n > m)
                {

                    // Choose 2 persons of Type1
                    n -= 2;

                    // And 1 person of Type2
                    m -= 1;
                }
                else
                {

                    // Choose 2 persons of Type2
                    m -= 2;

                    // And 1 person of Type1
                    n -= 1;
                }

                // Another team has been formed
                count++;
            }
            return count;
        }

        // Driver code
        public static void main(String args[])
        {
            int n = 4, m = 10;
            System.out.println(maxTeams(n, m));
        }

}
