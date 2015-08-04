import java.lang.Math;
import java.util.ArrayList;
public class problemNine {

    public static void main(String[] args) {
      long answer = findProduct(); 
      System.out.println(answer);
    }
  
    public static long findProduct(){
      long total = 0;
      double b, numerator, denominator;
      for(long a=1; a<1000; a++){
        numerator = 500000 - 1000*a;
        denominator = 1000 - a;
        b = numerator/denominator;
        if(b==Math.round(b)){
          System.out.println(a);
          System.out.println(b);
          return a*Math.round(b)*(1000-a-Math.round(b));
        }
      }
      return 0;
    }
}