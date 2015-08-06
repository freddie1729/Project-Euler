import java.lang.Math;

public class problem40 {

    public static void main(String[] args) {
      System.out.println(solve());
    }

    public static long solve(){
        long digitLength = 1;
        long position = 1;
        long k = 10;
        long answer = 1;
        for(long i=1; true; i++){
            if(i%k == 0){
                k *= 10;
                digitLength++;
            }
            if(Math.floor(Math.log10(position-1)) < Math.floor(Math.log10(position + digitLength - 1))){
                for(int j = 0; j < digitLength; j++){
                    if(isInteger(Math.log10(position + j))){
                        answer *= Long.parseLong(String.valueOf(i).substring(j, j+1));
                    }
                }
                if(position >= 1000000){
                    return answer;
                }
            }
            position += digitLength;
        }
    }

    public static Boolean isInteger(double n){
        return Math.floor(n) == n;
    }
}