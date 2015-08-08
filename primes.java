import java.lang.Math;
import java.util.ArrayList;
public class primes {

    public static void main(String[] args) {
      //ArrayList<Long> pfac = primeFactors(Long.parseLong(args[0],10)); 
      //System.out.println(pfac);
      System.out.println(isPrime(Long.parseLong(args[0],10)));
      //System.out.println(nthPrime(Long.parseLong(args[0],10)));
    }
  
    public static ArrayList<Long> primeFactors(long n){
      ArrayList<Long> factors = new ArrayList<Long>();
      while(n>1){
        for(long i=2; i<n+2; i++){
            if (n%i==0){
              factors.add(i);
              n=n/i;
              break;
            }
          }
      }
      return factors;
    }

    public static long nthPrime(long n) {
      long k=0;
      for(long i=2; k<=n; i++){
        if(isPrime(i)){
          k++;
        }
        if(k==n){return i;}
      }
      return 0;
    }

    public static Boolean isPrime(long n){
      if(n==2||n==3||n==5){return true;}
      if(n==0||n==1||n%2==0||n%3==0||n%5==0){return false;}
      long finish = Math.round(Math.sqrt(n));
      for(long i=6; i<=finish; i+=6){
        if((n%(i-1)==0)||(n%(i+1)==0)){
          return false;
        }
      }
      return true;
    }
}