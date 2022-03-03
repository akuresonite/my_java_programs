import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number: ");
    
    double num = sc.nextDouble();
    double ans;
    
    if(num>=0){
      ans = Math.sqrt(num);
      System.out.println(ans);
    }
    else{
      ans = Math.sqrt(-num);
      System.out.println(ans+"i");
    }    
   }
 }
