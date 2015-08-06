import java.lang.Math;

public class problem37 {

    public static void main(String[] args) {
      System.out.println(solve());
    }

    public static long solve(){
    	long j;
    	long k;
    	Boolean rightToLeft;
    	Boolean leftToRight;
    	long count = 0;
    	long sum = 0;
    	long digitCount;
    	for(long i = 10; true; i++){
    		if(count == 11){
    			return sum;
    		}
    		j = i;
    		rightToLeft = true;
    		while(j > 0){
    			if(primes.isPrime(j)){
    				j = (long)Math.floor(j/10);
    			} else {
    				rightToLeft = false;
    				break;
    			}
    		}
    		k = i;
    		leftToRight = true;
    		while(k > 0){
    			if(primes.isPrime(k)){
    				digitCount = (long)Math.ceil(Math.log10(k));
    				while(k >= Math.pow(10, digitCount-1)){
                        k -= Math.pow(10, digitCount-1);
    				}
    			} else {
    				leftToRight = false;
    				break;
    			}
    		}
    		if(leftToRight && rightToLeft){
    			sum += i;
    			count++;
    		}
    	}
    }
}