public class FactorialWithRecursion{
  public static long fact(long num){
    if(num == 0){
      return 1;
    }

    return num * fact(num - 1);
  }

  public static void main(String[] args){
    int num = Integer.parseInt(args[0]);
    long factorial = fact(num);
    System.out.println("factorial = " + factorial);
  }
}