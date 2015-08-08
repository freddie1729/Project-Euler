import java.lang.Math;
public class problem144 {

    public static void main(String[] args) {
      System.out.println(solve()); 
    }

    public static double[] nextIntersect(double x1, double y1, double x2, double y2){
      double m1 = (y2 - y1)/(x2 - x1); //Original gradient
      double m2 = -4*x2/y2; //Tangent gradient
      double m3 = (2*m2 - m1 + m1*m2*m2)/(-m2*m2 + 1 + 2*m1*m2); //New gradient
      double x3 = (y2*y2 - 2*y2*m3*x2 + m3*m3*x2*x2 - 100)/(4*x2); //X co-ord of new point
      double y3 = y2 + m3*(x3 - x2); //Y co-ord of new point

      double[] answer = {x3, y3};

      return answer;
    }

    public static long solve(){
      double X1 = 0;
      double Y1 = 10.1;
      double X2 = 1.4;
      double Y2 = -9.6;
      long n = 1;

      while(true){
        double[] ans = nextIntersect(X1, Y1, X2, Y2);
        X1=X2;
        Y1=Y2;
        X2=ans[0];
        Y2=ans[1];
        System.out.println("X: " + X2 + " Y: " + Y2);
        n++; 
        if((X2 < 0.01)&&(X2 > -0.01)&&(Y2>0)){
          return n;
        }
      }
    }
}