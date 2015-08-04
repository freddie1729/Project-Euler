import java.lang.Math;
public class problemFourteen {

    public static void main(String[] args) {
      System.out.println(longestChain(Long.parseLong(args[0]))); 
    }
  
    public static double collatz(double n){
      if(n%2==0){
        return Math.round(n/2);
      }
    return (3*n+1);
    }

    public static double longestChain(double limit){
      double longestChain = 1;
      double answer=1;
      for(double i=2;i<limit;i++){
        double j=i;
        double k=1;
        while(j!=1){
          j=collatz(j);
          k++;
          //System.out.println(j + "__" + k);
        }
        if(k>longestChain){
          longestChain=k;
          answer=i;
        }
      }
      /*
      double largestNumber=1;
      double example=answer;
      while(example!=1){
        //System.out.println(example);
        example=collatz(example);
        if(example>largestNumber){
          largestNumber=example;
        }
      }
      System.out.println(largestNumber);
      System.out.println(longestChain);
      */
      return answer;
    }

}