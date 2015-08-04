import java.lang.Math;
import java.math.BigInteger;
public class problemTwentyFive {

    public static void main(String[] args) {
      System.out.println(firstFib(Long.parseLong(args[0]))); 
    }

    public static long firstFib(long limit){
      BigInteger a = new BigInteger("1");
      BigInteger b = new BigInteger("1");
      BigInteger c = new BigInteger("0");
      for(long n=3; true; n++){
        c=a.add(b);
        a=b;
        b=c;
        if(getDigitCount(c)>=limit){
          return n;
        }
      }
    }
    
  public static int getDigitCount(BigInteger number) {
    double factor = Math.log(2) / Math.log(10);
    int digitCount = (int) (factor * number.bitLength() + 1);
    if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
      return digitCount - 1;
    }
    return digitCount;
  }
}