import java.util.*;
class BitwiseOperator{ 
       public static void main(String[] args){

            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number :");
            int num = sc.nextInt();

            System.out.print("Enter the second number :");
            int num2 = sc.nextInt();


        /*This operator (&) use for checking if first one is true than not check second condition.
         AND IF FIRST CONDITION IS NOT TRUE THAN CAN NOT CHECK SECOND CONDITION AND DECLAIRE ELSE IF/ELSE CONDITION*/ 
            if (num == 0 & num2 != 0){
               System.out.println("The both number are zero.");
            }
            else {
                System.out.println("The both number are not zero.");                
            }
        //This operator (|) use for checking if first one is true than not check second condition.
        //IF THE FIRST CONDITION IS NOT TRUE THAN NOT CHECK SECOND CONDITION DECLAIRE DIRECT ELSE -IF OR ELSE CONDITION ;
            // if (num == 0 | num2 != 0){
            //    System.out.println("The First number is Zero but not second.");
            // }
            // else {
            //     System.out.println("Exit");
            // }

            // if (num > 0 & num2 < 0){
            //    System.out.print("The both number are zero.");
            // }
            // else {
            //     System.out.print("The both number are not zero.");                
            // }

        // ALWAYS GIVE ERROR BECOUSE ( << ) IT ASSIGNE RIGHT OPERAND VALUE TO LEFT OPERAND LIKE A = 10 , B = 20 ;  A << 1; A = 4 ;
            // if (num >> 0){
            //    System.out.println("The First number is Zero but not second.");
            // }
            // else {
            //     System.out.println("Exit");
            // }

} }