public class VoterEligibility{
    public static void main(String[] args){
        Integer age = Integer.parseInt(args[0]);
        System.out.println(age);
        if(age<18){
            System.out.println("not eligible for vote");
        } else {
            System.out.println("eligible for vote");
        }
    }
}