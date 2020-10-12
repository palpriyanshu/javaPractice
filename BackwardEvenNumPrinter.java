public class BackwardEvenNumPrinter{
  public static void main(String[] args){
    int upperLimit = Integer.parseInt(args[0]);
    int limit = upperLimit - (upperLimit % 2);
    for (int i = limit; i >= 2; i-=2){
      System.out.println(i);
    }
  }
}