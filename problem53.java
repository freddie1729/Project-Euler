import java.lang.Math;
public class problem53 {

  public static void main(String[] args) {
    //System.out.println(choose(Long.parseLong(args[0]),Long.parseLong(args[1]))); 
    System.out.println(solve());
  }

  public static long choose(long n, long r){
    if(r>n/2){
      r=n-r;
    }
    long answer = 1;
    for(long i=n; i>(n-r); i--){
      answer *= i;
    }
    for(long j=r; j>1; j--){
      answer /= j;
    }
    return answer;
  }

  public static long solve(){
    long count = 0;
    for(long n=1; n<=100; n++){
      for(long r=1; r<n; r++){
        if(choose(n,r)>1000000){
          count += (n - 2*(r-1) -1);
          break;
        }
      }
    }
    return count;
  }
  
}
