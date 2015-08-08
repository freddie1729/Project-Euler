import java.lang.Math;
import java.util.ArrayList;
import java.util.HashSet;

public class problem69 {

    public static void main(String[] args) {
        System.out.println(solve(Long.parseLong(args[0])));
    }

    public static long solve(long limit){
        long max = 0;
        double maxRatio = 0;
        double ratio = 0;
        for(long n = 2; n<=limit; n++){
            ratio = n/(double)utils.phi(n);
            if(ratio > maxRatio){
                maxRatio = ratio;
                max = n;
            }
        }
        return max;
    }
}