public class Calc{
  public static void main(String[] args){
    float num1 = Float.parseFloat(args[0]);
    char operator = args[1].charAt(0);
    float num2 = Float.parseFloat(args[2]);
    float result = 0;
    switch(operator){
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      case '%':
        result = num1 % num2;
        break;
      default:
        System.out.println("Invalid operator");
    }
    System.out.println("result is " + result);
  }
}