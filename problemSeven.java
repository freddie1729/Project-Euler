import java.lang.Math;
public class problemSeven {

    public static void main(Long[] args) {
           System.out.printf("%d ", nthPrime(args[0]));
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
    if(n==2||n==3){return true;}
    long i;
    long finish = Math.round(Math.sqrt(n));
    for(i=2; i<=finish; i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
}