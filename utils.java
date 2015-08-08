import java.lang.Math;
import java.util.ArrayList;
import java.util.HashSet;

public class utils {

    public static void main(String[] args) {

    }

    public static Boolean isTriangle(long t){
      double n = 0.5*(-1 + Math.sqrt(1 + 8*t));
      return isInteger(n);
    }

    public static Boolean isPentagonal(long p){
        double n = (1 + Math.sqrt(1 + 24*p))/6;
        return isInteger(n);
    }

    public static Boolean isHexagonal(long h){
        double n = 0.25*(1 + Math.sqrt(1 + 8*h));
        return isInteger(n);
    }

    public static Boolean isInteger(double n){
        return Math.floor(n) == n;
    }

    public static long phi(long n){
        if(primes.isPrime(n)){
            return n-1;
        } else {
            ArrayList<Long> factors = primes.primeFactors(n);
            HashSet<Long> uniqueFactors = new HashSet<Long>(factors);
            double answer = n;
            for(long p : uniqueFactors){
                answer *= (1 - 1/(double)p);
            }
            return (long)answer;
        }
    }
}