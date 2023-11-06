import java.util.Scanner;

class Factorial{ 
       public static void main(String[] args){
            int num , multi=1, i=1;
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter Number you want to Factorial : ");
            num = sc.nextInt();

            while(i<num+1){
                multi = i * multi;
                i++;
            }
            i--;
            System.out.println("Here is Factorial of  " + i + " is = " + multi);

} }