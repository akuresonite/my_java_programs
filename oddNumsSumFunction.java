import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void oddNumsSum(int n){
     int sum = 1;
     
     for(int i=2;i<=n;i++){
       if(i%2 != 0){
         sum = sum + i;
       }
     }
     System.out.print("sum of odd numbers upto "+n+" is "+sum);
     return;
   }
   
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    System.out.print("Enter number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    oddNumsSum(n);
   }
 }
