import java.lang.Math;
public class problemThirtyOne {

    public static void main(String[] args) {
      System.out.println(solve()); 
    }

    public static long[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
    public static long ways;
  
    public static long solve(){
      ways = 0;
      numberOfWays(200, 8);
      return ways;
    }

    public static void numberOfWays(long amtLeft, int coinsLeft){
      if(amtLeft==0){
        ways++;
      } else if((amtLeft>0)&&(coinsLeft>=1)){
        long amtLeftStart = amtLeft;
        for(long j=0; amtLeft>=0; j++){
          amtLeft = amtLeftStart - j*coins[coinsLeft-1];
          numberOfWays(amtLeft,coinsLeft-1);
        }
      }
    }
}