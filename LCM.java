public class LCM{
  public static void main(String[] args){
    final int num1 = Integer.parseInt(args[0]);
    final int num2 = Integer.parseInt(args[1]);
    int smallerNum = num1;
    int largerNum = num2;
    if(num1 > num2){
      smallerNum = num2;
      largerNum = num1;
    }

    while(smallerNum != 0){
      int hcf = smallerNum;
      smallerNum = largerNum % smallerNum;
      largerNum = hcf;
    }
    System.out.println("LCM of " + num1 + " and " + num2 + " is " + (num1 * num2)/largerNum);

  }
}