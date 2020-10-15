public class MultiplicationTable{
  public static void main(String[] args){
    int multiplyBy = Integer.parseInt(args[0]);
    int multiplierLimit = Integer.parseInt(args[1]);
    for (int multiplier = 1; multiplier <= multiplierLimit; multiplier++){
      System.out.println(multiplyBy + " * " + multiplier + " = " + multiplyBy*multiplier);
    }
  }
}