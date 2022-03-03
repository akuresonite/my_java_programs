import java.util.*;

 // Compiler version JDK 11.0.2
 // n  1 2 3 4 5 6 7  8  9...
 // f  0 1 1 2 3 5 8 13 21...

 class Fibonacci
 {
   
   public static int fibo(int n){
     
     int a = 0, b = 1;
     
     for(int i=2;i<n;i++){
       
     int c = a + b;
     
         a = b;
         b = c;
        
     }
     
     return b;
     
   }
   
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!\n");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter num : ");
    
    int f = sc.nextInt();
    
    System.out.println("\nFn = "+fibo(f));
   }
 }
