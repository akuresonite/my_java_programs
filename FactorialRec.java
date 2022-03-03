import java.util.*;

 // Compiler version JDK 11.0.2

 class FactorialRec
 {
   public static int factorial(int n){
     
     int ans;
     
     if(n==0 || n==1){
      return 1;      
     }
     
      return n * factorial(n-1);
    
     
   }
   
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter num: ");
    
    int num = sc.nextInt();
    
    int ans =factorial(num);
    
    System.out.println(num+"! = "+ans);
   }
 }
    