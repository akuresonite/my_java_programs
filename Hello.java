import java.util.*;

 // Compiler version JDK 11.0.2

 class Hello
 {
   public static void main(String args[])
   { 
     String text ="ashish";
     message(text,5);
   }
   
   static int t = 1;
   
   public static void message(String msg, int n){
     
     if(n!=0){
      
       System.out.println(t+" "+msg);
       t++;
       message(msg,n-1);
       return;

     }  
   }
 }
