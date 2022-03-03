import java.util.*;

 // Compiler version JDK 11.0.2

 class RangeSum
 {
   public static int sum(int n){
     
     if(n==0){
       return 0;
     }
     else{
       return n + sum(n-1);
     }
   }
   
   public static void main(String args[]){
    System.out.println("Hello, Dcoder!");
    
    Scanner sc = new Scanner( System.in);
    
    System.out.println("Enter first num & last num: ");
    
    int x = sc.nextInt();
    
    int y = sc.nextInt();
    
    int ans = sum(y) - sum(x);
    
    System.out.println("Σ("+x+","+y+") = "+ans);
   }
 
 }
