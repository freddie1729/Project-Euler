import java.lang.Math;

public class problem40 {

    public static void main(String[] args) {
      System.out.println(solve());
    }

    public static long solve(){
        String number = "";
        for(long i=0; number.length() <= 1000000; i++){
            number += String.valueOf(i);
        }
        long answer = 1;
        for(long j=0; j<=6; j++){
            answer *= Long.parseLong(number.substring((int)Math.pow(10, j)-1,(int)Math.pow(10, j)));
        }
        return answer;
    }

}