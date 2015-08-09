import java.lang.Math;

public class problem243 {

    public static void main(String[] args) {
        System.out.println(solve());
    }

    public static double R(long d){
        return (double)utils.phi(d)/((double)d-1);
    }

    public static long solve(){
        for(long d = 1; true; d++){
            if(R(d)<(double)15499/94744){
                return d;
            }
            if(d%10000 == 0){
                System.out.println(d);
            }
        }
    }


}