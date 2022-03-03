import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void hanoi(int n, String s, String h, String d){
     
     if(n==1){
       System.out.println("transfer disc "+n+"  from "+s+" to "+d);
       return;
       }
     
     hanoi(n-1,s,d,h);
     
     System.out.println("transfer disc "+n+"  from "+s+" to "+d);
     
     hanoi(n-1, h,s,d);
     
   }
   
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    
    int disc = 3;
    
    hanoi(disc, "s", "h", "d");
   }
 }
