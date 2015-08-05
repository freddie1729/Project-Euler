import java.lang.Math;

public class problem35 {

    public static void main(String[] args) {
      System.out.println(cycleDigits(Long.parseLong(args[0])));
    }

    public static long cycleDigits(long n){
    	return Long.parseLong(String.valueOf(n).substring(1) + String.valueOf(n).substring(0,1));
    }
}