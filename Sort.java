import java.util.*;

 // Compiler version JDK 11.0.2

 class Sort
 {
   
   public static void sort(String str){
     
     char a, b;
     
     for(int i=0;i<str.length();i++){
       
       a = str.charAt(i);
       b = str.charAt(i+1);
       
       if(b<a){
         
         str = b + a + str.substring(i+2);
       }
     }
     System.out.println(str);
   }
   
   
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter string: ");
    
    String input = sc.nextLine();
    
    sort(input);
    
   }
 }
