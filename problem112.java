import java.lang.Math;

public class problem112 {

    public static void main(String[] args) {
        System.out.println(solve(Long.parseLong(args[0]))); 
    }

    public static Boolean bouncy(long n){
        long m = n;
        Boolean increasing = true;
        Boolean decreasing = true;
        long length = (long)Math.floor(Math.log10(n));
        for(int i = 1; i<=length; i++){
            if(m%10 < ((m-m%10)/10)%10){
                increasing = false;
                break;
            }
            m = (long)Math.floor(m/10);
        }
        for(int j = 1; j<=length; j++){
            if(n%10 > ((n-n%10)/10)%10){
                decreasing = false;
                break;
            }
            n = (long)Math.floor(n/10);
        }
        return !increasing && !decreasing;
    }

    public static long solve(long percent){
        long bouncy = 0;
        for(long i = 1; true; i++){
            if(bouncy(i)){
                bouncy++;
            }
            if(100*bouncy/i >= percent){
                return i;
            }
        }
    }
}