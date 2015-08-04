import java.lang.Math;
public class problem144 {

    public static void main(String[] args) {
      System.out.println(solve()); 
    }

    public static double[] nextIntersect(double x1, double y1, double x2, double y2){
      double originalGradient = (y2 - y1)/(x2 - x1);
      double tangentGradient = -4*x2/y2;
      double tangentOfAngle = Math.abs((tangentGradient - originalGradient)/(1+tangentGradient*originalGradient));
      double productOfGradients = (Math.pow(tangentOfAngle,2) - Math.pow(tangentGradient,2))/(Math.pow(tangentOfAngle,2)*Math.pow(tangentGradient,2)-1);
      double newGradient = productOfGradients/originalGradient;
      double productOfXRoots = 0.25*(y2 - 100 - newGradient*x2);
      double newX = productOfXRoots/x2;
      double newY = Math.sqrt(Math.abs(100-4*newX*newX));
      double[] answer = {newX, newY};
      System.out.println((100-4*Math.pow(newX,2)) + "  " + originalGradient + " " + tangentGradient + " " + tangentOfAngle + " " + productOfGradients + " " + newGradient + " " + productOfXRoots + " " + newX + " " + newY);

      /*double newGradient = (tangentGradient + tangentOfAngle)/(1 + tangentGradient*tangentOfAngle);
      double productOfXRoots = 0.25*(y2*y2 - 2*y2*newGradient*x2 - 100 + newGradient*newGradient*x2*x2);
      double newXCoOrd = productOfXRoots/x2;
      double newYCoOrd = Math.sqrt(100-4*newXCoOrd*newXCoOrd);
      double[] answer = {newXCoOrd, newYCoOrd};*/
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
     // return 0;
    }
}