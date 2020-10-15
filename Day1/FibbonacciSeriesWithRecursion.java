public class FibbonacciSeriesWithRecursion{

  public static int fibbo(int term){
    if(term == 0 || term == 1){
      return term;
    }
    return fibbo(term - 1) + fibbo(term - 2);
  }

  public static void main(String[] args){
    int nthTerm = Integer.parseInt(args[0]);
    for(int term = 0; term <= nthTerm; term++){
      System.out.println(fibbo(term));
    }
  }
}