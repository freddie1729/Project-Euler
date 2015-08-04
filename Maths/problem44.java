import java.lang.Math;
import java.util.ArrayList;
public class problem44 {

  public static void main(String[] args) {
    //System.out.println(choose(Long.parseLong(args[0]),Long.parseLong(args[1]))); 
    System.out.println(solve());
  }

  public static long solve(){
    ArrayList<Long> pentagonalNumbers = new ArrayList<Long>();
    long firstOne = 0;
    pentagonalNumbers.add(firstOne);
    for(long index=1; index<6000; index++){
      pentagonalNumbers.add(pentagonal(index));
    }
    for(long d=1; true; d++){
      System.out.println(d);
      //for(long i=pentagonalNumbers.size(); pentagonalNumbers.get(pentagonalNumbers.size() - 1)<pentagonal(d); i++){
      //  pentagonalNumbers.add(pentagonal(i));
      //}
      for(long k=(d+1); pentagonal(d)>separation(k); k++){
        //Add any new pentagonal numbers necessary to the ArrayList
        //System.out.println("d = " + d + " k = " + k + " pentnos = " + pentagonalNumbers.get(pentagonalNumbers.size()-1));
        //for(long i=pentagonalNumbers.size(); pentagonalNumbers.get(pentagonalNumbers.size() - 1)<(pentagonal(k)-pentagonal(d)); i++){
         // pentagonalNumbers.add(pentagonal(i));
        //}
        //if(d==1912){System.out.println("d = " + d + " k = "+k+" P_k - D = " + (pentagonal(k)-pentagonal(d)) );}
        if(pentagonalNumbers.contains(pentagonal(k)-pentagonal(d))){
          //Add some more if necessary
          long numberToCheck = 2*pentagonal(k)-pentagonal(d);
          //for(long n=pentagonalNumbers.size(); pentagonalNumbers.get(pentagonalNumbers.size() - 1)<numberToCheck; n++){
          // pentagonalNumbers.add(pentagonal(n));
         // }
          if(pentagonalNumbers.contains(numberToCheck)){
            return pentagonal(d);
          }
        }
      }
    }
  }

  public static long pentagonal(long n){
    return n*(3*n-1)/2;
  }

  public static long separation(long n){
    //P_n - P_n-1
    return (n*(3*n-1)/2 - (n-1)*(3*(n-1)-1)/2);
  }
  
}
