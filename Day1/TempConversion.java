public class TempConversion{

  public static double convertToFah(double tempInCel){
    return (tempInCel * 9 / 5) + 32;
  }

  public static double convertToCel(double tempInFah){
    return 5 / 9 * ( tempInFah - 32);
  }

  public static void main(String[] args){
    float temp = Integer.parseInt(args[0]);
    char tempUnit = args[1].toLowerCase().charAt(0);
    switch (tempUnit){
      case 'c':
        System.out.println("temp in Fahrenheit = " + convertToFah(temp));
        break;
      case 'f':
        System.out.println("temp in celcius = " + convertToCel(temp));
        break;
    }
  }
}