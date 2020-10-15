public class HCF{

  public static int findHcf(int num1, int num2){
    int dividend = num1;
    int divisor = num2;

    while(dividend != 0){
      int hcf = dividend;
      dividend = divisor % dividend;
      divisor = hcf;
    }
    return divisor;
  }

  public static void main(String[] args){
    final int num1 = Integer.parseInt(args[0]);
    final int num2 = Integer.parseInt(args[1]);
    
    System.out.println("HCF of " + num1 + " and " + num2 + " is " + findHcf(num1, num2));

  }
}