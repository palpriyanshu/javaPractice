public class Seasons{
    public static void main(String[] args){
        int month = Integer.parseInt(args[0]);
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter Season");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer Season");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Rainy Season");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn Spring Season");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }
}