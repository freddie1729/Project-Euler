import java.lang.Math;
import java.util.ArrayList;
public class problemTwelve {

    public static void main(String[] args) {
      System.out.println(answer(Long.parseLong(args[0],10))); 
    }
  
    public static ArrayList<Long> factors(long n){
      ArrayList<Long> factors = new ArrayList<Long>();
      for(long i=1; i<=n; i++){
        if(n%i==0){
          factors.add(i);
        }
      }
      return factors;
    }

    public static long factorCount(long n){
      long count = 0;
      for(long i=1; i<=Math.sqrt(n); i++){
        if((n%i==0)&&(n!=i*i)){
          count += 2;
        } else if((n%i==0)&&(n==i*i)){
          count++;
        }
      }
      return count;
    }

    public static long answer(long divisorLimit){
      long triangle = 1;
      for(long n=2; true; n++){
        triangle += n;
        if(factorCount(triangle)>divisorLimit){
          return triangle;
        }
      }
    }
}