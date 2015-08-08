import java.lang.Math;

public class problem243 {

    public static void main(String[] args) {
        System.out.println(R(Long.parseLong(args[0])));
    }

    public static double R(long d){
        return (double)utils.phi(d)/((double)d-1);
    }


}