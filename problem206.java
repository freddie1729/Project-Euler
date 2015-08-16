import java.lang.Math;
import java.util.ArrayList;

public class problem206 {

    public static void main(String[] args) {
        System.out.println(solve());
    }

    public static long solve(){
        double toCheck = 0;
        for(long i = 0; i<10; i++){
            for(long j = 0; j<10; j++){
                for(long k = 0; k<10; k++){
                    for(long l = 0; l<10; l++){
                        for(long m = 0; m<10; m++){
                            for(long n = 0; n<10; n++){
                                for(long o = 0; o<10; o++){
                                    for(long p = 0; p<10; p++){
                                        for(long q = 0; q<10; q++){
                                            toCheck = Math.pow(10,18);
                                            toCheck += i*Math.pow(10,17);
                                            toCheck += 2*Math.pow(10,16);
                                            toCheck += j*Math.pow(10,15);
                                            toCheck += 3*Math.pow(10,14);
                                            toCheck += k*Math.pow(10,13);
                                            toCheck += 4*Math.pow(10,12);
                                            toCheck += l*Math.pow(10,11);
                                            toCheck += 5*Math.pow(10,10);
                                            toCheck += m*Math.pow(10,9);
                                            toCheck += 6*Math.pow(10,8);
                                            toCheck += n*Math.pow(10,7);
                                            toCheck += 7*Math.pow(10,6);
                                            toCheck += o*Math.pow(10,5);
                                            toCheck += 8*Math.pow(10,4);
                                            toCheck += p*Math.pow(10,3);
                                            toCheck += 9*Math.pow(10,2);
                                            toCheck += q*10;
                                            if(utils.isInteger(Math.sqrt(toCheck))){
                                                return (long)Math.sqrt(toCheck);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }



}