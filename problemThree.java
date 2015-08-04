import java.lang.Math;
public class problemThree {

    public static void main(String[] args) {
      System.out.printf("%d ", largestPrimeFactor(Long.parseLong(args[0], 10))); 
    }
  
    public static long largestPrimeFactor(long n){
      for(long i=n; i>=2; i--){
        if((n%i==0)&&(primes.isPrime(i))){
          return i;
        }
      }
    return 1;      
    }
}