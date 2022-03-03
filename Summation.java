import java.util.*;

 // Compiler version JDK 11.0.2

 class Summation
 {
   public static int sumNum(int n){
     
     if(n==0){
       return 0;
     }
     
     return n + sumNum(n-1);
   }
   
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter num: ");
    
    int num = sc.nextInt();
    
    int ans = sumNum(num);
    
    System.out.println("Σ(1,"+num+") = "+ans);
   }
 }
         