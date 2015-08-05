import java.lang.Math;

public class problem35 {

    public static void main(String[] args) {
      System.out.println(solve(Long.parseLong(args[0])));
    }

    public static String cycleDigits(String n){
    	return n.substring(1) + n.substring(0,1);
    }

    public static long solve(long max){
    	long count = 0;
    	int length = 1;
    	int p = 10;
        String k;
    	for(long i=2; i<max; i++){
    		if(i%p == 0){
    			length++;
    			p *= 10;
    		}
    		Boolean allPrime = true;
            k = String.valueOf(i);
    		for(long j=0; j<length; j++){
                if(primes.isPrime(Long.parseLong(k))){
                    k = cycleDigits(k);
    			} else {
    				allPrime = false;
    				break;
    			}
    		}
    		if(allPrime){
    			count++;
    		}
    	}
    	return count;
    }


}