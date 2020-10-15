public class FibbonacciSeries{
  public static void main(String[] args){
    int nthTerm = Integer.parseInt(args[0]);
    int secondLastTerm = 0;
    int lastTerm = 1;

    if(nthTerm == 0){
      System.out.println(secondLastTerm);
    } else if(nthTerm == 1){
      System.out.println(secondLastTerm);
      System.out.println(lastTerm);
    } else {
      System.out.println(secondLastTerm);
      System.out.println(lastTerm);
      for (int term = 2; term <= nthTerm; term++) {
        int currentTerm = secondLastTerm + lastTerm;
        System.out.println(currentTerm);
        secondLastTerm = lastTerm;
        lastTerm = currentTerm;
      }
    }
  }
};
