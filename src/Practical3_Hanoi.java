public class Practical3_Hanoi {

    static int HanoiRecusrive(int n, char source, char dest, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source  + " to " + dest);
        }
        else{
            HanoiRecusrive(n-1, source, auxiliary, dest);
            System.out.println("Move disk " + n + " from " + source  + " to " + dest);
            HanoiRecusrive(n-1, auxiliary, dest, source);
        }

        return 0;
    }

    public static void main (String args[])
    {
        final long startTime = System.currentTimeMillis();
        int n = 4;
        HanoiRecusrive(n, 'A', 'C', 'B' );
        final long elapsedTimeRecursive = System.currentTimeMillis() - startTime;
        System.out.println("The time taken is :" + elapsedTimeRecursive);
    }
}
