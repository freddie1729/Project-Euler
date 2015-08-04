import java.lang.Math;
public class problem92 {

  public static void main(String[] args) {
    System.out.println(count(Long.parseLong(args[0],10))); 
  }

  public static long sumOfDigitSquares(long n){
    long sum = 0;
    while (n>0){
      sum += Math.pow(n%10,2);
      n=(n-n%10)/10;
    }
    return sum;
  }

  public static long count;

  public static long count(long max){
    count=0;
    solve(max);
    return count;
  }

  public static void solve(long max){
    long m = 0;
    for(long k=1;k<max;k++){
      m=k;
      while(m!=89&&m!=1){
        m=sumOfDigitSquares(m);
      }
      if(m==89){count++;}
    }
  }
}
