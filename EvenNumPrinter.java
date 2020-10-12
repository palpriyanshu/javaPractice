public class EvenNumPrinter{
  public static void main(String[] args){
    int upperLimit = Integer.parseInt(args[0]);
    for (int i = 2; i < upperLimit; i+=2) {
        System.out.println(i);
    }
  }
}