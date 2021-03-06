import java.lang.Math;
public class problemEight {

    public static void main(String[] args) {
      System.out.println(answer(args[0])); 
    }
  
    public static long answer(String series){
      long product;
      long highestProduct = 1;
      for(int i=0; (i+13)<=series.length(); i++){
        product = 1;
        for(int j=0; j<=12; j++){
          product *= Character.getNumericValue(series.charAt(i+j));
        }
        if(product>highestProduct){
          highestProduct = product;
        }
      }
      return highestProduct;
    }
}
