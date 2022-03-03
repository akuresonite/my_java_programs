import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void votingEligibility(int age){
     if(age >= 18){
       System.out.print("you can vote");
     }
     else{
       System.out.print("you cannot vote");
     }
   }
   
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    System.out.print("Enter your age: ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    votingEligibility(age);
   }
 }
