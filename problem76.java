import java.lang.Math;
public class problem76 {

  public static void main(String[] args) {
    System.out.println(solve(Long.parseLong(args[0],10))); 
  }

  public static long ways;

  public static long solve(long n){
    ways = 0;
    numberOfWays(n, n);
    return (ways-1);
  }

  public static void numberOfWays(long n, long intsLeft) {
    if(n==0&&intsLeft>=0){
      ways++;
    } else if(intsLeft!=0){
      for(long k=0; n>=k*intsLeft; k++){
        //System.out.println(ways);
        numberOfWays(n-k*intsLeft,intsLeft-1);
      }
    }
  }

}
