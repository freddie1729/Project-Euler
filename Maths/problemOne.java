import java.lang.Math;
public class problemOne {

    public static void main(String[] args) {
      System.out.println(answer()); 
    }
  
    public static int answer(){
      int sum = 0;
      for(int i=1; i<1000; i++){
        if((i%3==0)||(i%5==0)){
          sum = sum + i;
        }
      }
      return sum;
    }
}