public class FibbonacciSeries{
  public static void main(String[] args){
    int term = Integer.parseInt(args[0]);
    int num1 = 0;
    int num2 = 1;
    if(term == 0){
      System.out.println(num1);
    } else if(term == 1){
      System.out.println(num1);
      System.out.println(num2);
    } else {
      System.out.println(num1);
      System.out.println(num2);
      for (int i = 2; i <= term; i++){
        int num3 = num1 + num2;
        System.out.println(num3);
        num1 = num2;
        num2 = num3;
      }
    }


  }
};
