import java.lang.Math;
public class problemFifteen {

    public static void main(String[] args) {
      System.out.println(solve(Long.parseLong(args[0]))); 
    }

    public static double answer;
  
    public static double solve(double limit){
      answer = 0;
      numberOfWays(0, 0, limit);
      return answer;
    }

    public static void numberOfWays(double i, double j, double limit){
      if((i==limit)&&(j==limit)){
        answer++;
      }
      if(i<limit){
        numberOfWays(i+1, j, limit);
      } 
      if(j<limit){
        numberOfWays(i, j+1, limit);
      }
    }
}