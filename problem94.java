import java.lang.Math;
public class problem94 {

  public static void main(String[] args) {
    System.out.println(solve(Long.parseLong(args[0]))); 
  }

  public static double areaOfTriangle(double a, double b, double c){
  	double p = (a + b + c)/2;
  	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
  }

  public static long solve(long periLimit){
  	long count = 0;
  	double area = 0;
  	for(double k=1; 3*k-1<periLimit; k++){
  		area = areaOfTriangle(k,k,k-1);
  		if(primes.isInteger(area)){
  			count++;
  		}
  		//System.out.println(k + " " + k + " " + (k-1) + "  " + area + "  " + count);
  		area = areaOfTriangle(k,k,k+1);
  		if(primes.isInteger(area)){
  			count++;
  		}
  		//System.out.println(k + " " + k + " " + (k+1) + "  " + area + "  " + count);
  	}
    //System.out.println(area + "  " + count);

  	return count;
  }

  
}
