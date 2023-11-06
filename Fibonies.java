//2.	Write a program for calculating factorial of given no.
import java.util.*;
class Fibonies{ 
       public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number you want up to Fibonies Series : ");
            int num = sc.nextInt();


            int num1 = 0, num2 = 1;
            int temp;

            System.out.print(num1 + " " + num2 +" ");

               for (int i= 1 ; i <= num ; i++){
                    // 0 = 0 + 1;
                    // 1 prt
                    // 1 + 1;
                    // 2 prt;
                    // 2 + 1;
                    //     3;
                    //    3+2;
                    //    5;

                    temp /*1*//*2*//*8*//*13*/ = num1  /*0*//*1*//*1*//*2*//*3*//*5*/+ num2 /*1*//*1*//*2*//*3*//*5*//*8*/;
                    num1 /*1*//*1*//*2*//*3*//*5*//*1*/ = num2 /*1*//*1*//*2*//*3*//*5*/;
                    num2 /*1*//*2*//*3*//*5*//*8*/ = temp /*1*//*2*//*3*//*5*//*8*/;


                System.out.print(temp + "     ");

               }


} }