import java.lang.Math;
public class problem52 {

    public static void main(String[] args) {
      System.out.println(solve()); 
    }

    public static void solve() {
      for(long k=1; true; k++){
        
        if(k/Math.pow(10,Math.floor(Math.log10(k)))<2){
          k=Math.pow(10,Math.ceil(Math.log10(k)));
        }
      }
    }

}
