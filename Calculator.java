public class Calculator{

  public static void showOptions(){
    System.out.println("Following are the operations you can perform : ");
    System.out.println("1. Add  ");
    System.out.println("2. Subtract  ");
    System.out.println("3. Multiply  ");
    System.out.println("4. Divide  ");
    System.out.println("5. Modulo  ");
  }

  public static void main(String[] args){
    int option = Integer.parseInt(args[0]);
    int num1 = Integer.parseInt(args[1]);
    int num2 = Integer.parseInt(args[2]);

    showOptions();
    System.out.println("you have chosen option no. " + option + " to perform");

    int result = 0;

    switch (option){
      case 1:
        result = num1 + num2;
        break;
      case 2:
        result = num1 - num2;
        break;
      case 3:
        result = num1 * num2;
        break;
      case 4:
        result = num1 / num2; 
        break;
      case 5:
        result = num1 % num2;
        break;
      default:
        System.out.println("option is not in list");
    }
    System.out.println("result is " + result);
  }
}