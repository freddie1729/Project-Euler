import java.lang.Math;
public class problem46 {

    public static void main(String[] args) {
      System.out.println(solve()); 
    }

    public static long solve() {
      for(long n=1; true; n++){
        if((!primes.isPrime(n))&&(n%2==1)){
          System.out.println(n);
          for(long k=1; true; k++){
            if(primes.isPrime(n-2*k*k)){
              break;
            } else if(n<2*k*k){
              return n;
            }
          }
        }
      }
    }

}
