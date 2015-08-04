import java.lang.Math;
public class problemSeventeen {

    public static void main(String[] args) {
      System.out.println(letters()); 
    }
  
    public static long letters(){
      long runningTotal=0;
      long tensPart;
      long[] smallNos = new long[101];
      smallNos[1]=3;
      smallNos[2]=3;
      smallNos[3]=5;
      smallNos[4]=4;
      smallNos[5]=4;
      smallNos[6]=3;
      smallNos[7]=5;
      smallNos[8]=5;
      smallNos[9]=4;
      smallNos[10]=3;
      smallNos[11]=6;
      smallNos[12]=6;
      smallNos[13]=8;
      smallNos[20]=6;
      smallNos[30]=6;
      smallNos[40]=5;
      smallNos[50]=5;
      smallNos[60]=5;
      smallNos[70]=7;
      smallNos[80]=6;
      smallNos[90]=6;
      smallNos[100]=10;
      for(int i=1;i<10;i++){
        runningTotal += smallNos[i];
      }
      long oneToNine = runningTotal;
      for(int i=10;i<=13;i++){
        runningTotal += smallNos[i];
      }
      for(int i=14;i<20;i++){
        runningTotal += (smallNos[i-10] +4);
      }
      runningTotal -= 2;
      for(int i=2;i<10;i++){
        runningTotal += (10*smallNos[10*i] + oneToNine);
      }
      long oneToNinetyNine = runningTotal;
      for(int i=1;i<10;i++){
        runningTotal += (100*(smallNos[i]+10)+oneToNinetyNine-3);
      }
      runningTotal += 11;
      return runningTotal;
    }
}

    