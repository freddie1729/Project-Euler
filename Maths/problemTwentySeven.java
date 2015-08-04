import java.lang.Math;
public class problemTwentySeven {

    public static void main(String[] args) {
      System.out.println(mostPrimes()); 
    }

    public static long quadratic(long n, long a, long b){
      return (n*n + a*n + b);
    }

    public static long mostPrimes(){
      long a, b, n;
      long product = 0;
      long longestChain = 0;
      for(b=2; b<1000; b++){
        if(primes.isPrime(b)){
          for(a=-999; a<1000; a++){
            for(n=0; true; n++){
              if((quadratic(n,a,b)<2)||(!primes.isPrime(quadratic(n,a,b)))){
                if((n-1)>longestChain){
                  longestChain = n-1;
                  product = a*b;
                }
                break;
              }   
            }
          }
        }
      }
      return product;
    }
    
}