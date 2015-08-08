import java.lang.Math;

public class problem45 {

    public static void main(String[] args) {
        System.out.println(solve()); 
    }

    public static Boolean isTriangle(long t){
      double n = 0.5*(-1 + Math.sqrt(1 + 8*t));
      return isInteger(n);
    }

    public static Boolean isPentagonal(long p){
        double n = (1 + Math.sqrt(1 + 24*p))/6;
        return isInteger(n);
    }

    public static Boolean isHexagonal(long h){
        double n = 0.25*(1 + Math.sqrt(1 + 8*h));
        return isInteger(n);
    }

    public static Boolean isInteger(double n){
        return Math.floor(n) == n;
    }

    public static long solve(){
        for(long i = 40756; true; i++){
            if(isTriangle(i) && isPentagonal(i) && isHexagonal(i)){
                return i;
            }
            if(i%10000 == 0){
                System.out.println(i);
            }
        }
    }

}