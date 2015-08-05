import java.lang.Math;

public class problem35 {

    public static void main(String[] args) {
      System.out.println(solve(Long.parseLong(args[0])));
    }

    public static long cycleDigits(long n){
    	return Long.parseLong(String.valueOf(n).substring(1) + String.valueOf(n).substring(0,1));
    }

    public static long solve(long max){
    	long count = 0;
    	int length = 1;
    	int p = 10;
    	long k;
    	for(long i=2; i<max; i++){
    		k = i;
    		if(i%p == 0){
    			length++;
    			p *= 10;
    		}
    		Boolean allPrime = true;
    		for(long j=0; j<length; j++){
    			if(primes.isPrime(i)){
    				i = cycleDigits(i);
    			} else {
    				allPrime = false;
    				break;
    			}
    		}
    		if(allPrime){
    			count++;
    		}
    		i = k;
    	}
    	return count;
    }


}