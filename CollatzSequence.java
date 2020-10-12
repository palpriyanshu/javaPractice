public class CollatzSequence{
  public static void main(String[] args){
    int num = Integer.parseInt(args[0]);
    while(num > 1){
      System.out.println(num);
      if(num % 2 == 0){
        num = num / 2;
      } else {
        num = num * 3 + 1;
      }
    }
  }
}