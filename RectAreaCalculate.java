// 4.	Write a program for calculating area of rectangle using class.

// import the laibrary for scanner class/user input .
import java.util.*;

// Base class ;
class RectArea{

    int l, w;

    // function for calculating the Area of Retangle
    int add(int l,int w){
        return (l*w);
    }

}

// Derived class
class RectAreaCalculate{ 
       public static void main(String[] args){

           System.out.println();
        // Object Declairation
            RectArea A1 = new RectArea();
            
        // scanning/taking input by user.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of rectangle : ");
             A1.l = sc.nextInt();

             System.out.print("Enter the width of rectangle : ");
             A1.w = sc.nextInt();

        // Giving the return value in result and call a function using object of A1 another class or base class; 
            int result = A1.add(A1.l,A1.w);

        // Printing the output of the Area of rectangle ;
            System.out.println("The Area of Rectangle is : " + result);

} }