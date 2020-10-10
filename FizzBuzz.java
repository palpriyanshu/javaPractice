public class FizzBuzz{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        for(int i=0; i<num; i++){
            boolean isMultipleOf3 = i % 3 == 0;
            boolean isMultipleOf5 = i % 5 == 0;
            if(isMultipleOf5 && isMultipleOf3){
                System.out.println("fizz Buzz");
            } else if(isMultipleOf5){
                System.out.println("buzz ");
            } else if(isMultipleOf3){
                System.out.println("fizz ");
            } else {
                System.out.println(i);
            }
        }
        // int i = 0;    
        // while(i < num){
        //   if(i % 3 == 0){
        //         System.out.println("fizz "  + i);
        //     } else {
        //         System.out.println("buzz " + i);
        //     } 
        //     i++; 
        // }

        // do{
        //    if(i % 3 == 0){
        //         System.out.println("fizz "  + i);
        //     } else {
        //         System.out.println("buzz " + i);
        //     } 
        //     i++; 
        // } while(i < num);
    }
}