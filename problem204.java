import java.lang.Math;
import java.util.HashSet;

public class problem204 {

    public static void main(String[] args) {
        count(1, 0);
        System.out.println(totals.size());
    }

    public static HashSet<Long> totals = new HashSet<Long>();

    public static long[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 87, 89, 97, 103};

    public static void count(long currentTotal, int whichPrime){
        if(primes[whichPrime] < 100){
            while(currentTotal <= Math.pow(10,9)){
                count(currentTotal, whichPrime + 1);
                totals.add(currentTotal);
                currentTotal *= primes[whichPrime];
            }
        }
    }
}