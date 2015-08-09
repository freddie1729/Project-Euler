import java.lang.Math;
import java.util.Random;

public class problem205 {

    public static void main(String[] args) {
        System.out.printf("%.7f", solve(Long.parseLong(args[0])));
    }

    public static double solve(long numberOfTries){
        Random rn = new Random();
        int colin;
        int peter;
        long peterWins = 0;
        for(long i = 0; i<numberOfTries; i++){
            peter = 0;
            for(int j = 0; j<9; j++){
                peter += rn.nextInt(4) + 1;
            }
            colin = 0;
            for(int k = 0; k<6; k++){
                colin += rn.nextInt(6) + 1;
            }
            if(peter > colin){
                peterWins++;
            }
        }
        return (double)peterWins/(double)numberOfTries;
    }

}