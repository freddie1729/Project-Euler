import java.lang.Math;
public class problem19 {

  public static void main(String[] args) {
    //System.out.println(choose(Long.parseLong(args[0]),Long.parseLong(args[1]))); 
    System.out.println(solve());
  }

  public static long solve(){
    long count = 0;
    long firstDayOfMonth = 2;
    for(long y=1901; y<2001; y++){
      for(long m=1; m<=12; m++){
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
          firstDayOfMonth = (firstDayOfMonth + 31)%7;
        } else if(m!=2){
          firstDayOfMonth = (firstDayOfMonth + 30)%7;
        } else if(y%4!=0) {
          firstDayOfMonth = (firstDayOfMonth + 28)%7;
        } else {
          firstDayOfMonth = (firstDayOfMonth + 29)%7;
        }
        if(firstDayOfMonth == 0){
          count++;
        }
      }
    }
    return count;
  }
  
}
