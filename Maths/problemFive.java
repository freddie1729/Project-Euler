import java.lang.Math;
import java.util.ArrayList;
public class problemFive {

    public static void main(String[] args) {
      Long pfac = lcmUpToN(Long.parseLong(args[0],10)); 
      System.out.println(pfac);
    }
  
    public static Long lcmUpToN(Long n){
      long runningProduct = 1;
      long interimProduct;
      long nextProduct;
      for(long i=2; i<=n; i++){
        if(primes.isPrime(i)){
          interimProduct = 1;
          nextProduct = 1;
          while(nextProduct<=n){
            interimProduct = interimProduct*i;
            nextProduct = interimProduct*i;
          }
          runningProduct = runningProduct*interimProduct;
        }
      }
      return runningProduct;
    }
}