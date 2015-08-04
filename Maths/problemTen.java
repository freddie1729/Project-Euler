import java.lang.Math;
import java.util.ArrayList;
public class problemTen {

    public static void main(String[] args) {
      long answer = sumOfAllPrimes(Long.parseLong(args[0],10)); 
      System.out.println(answer);
    }
  
    public static long sumOfAllPrimes(long n){
      long total = 0;
      for(long i=2; i<n; i++){
        if(primes.isPrime(i)){
          total += i;
        }
      }
      return total;
    }
}