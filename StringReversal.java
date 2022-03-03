import java.util.*;

 // Compiler version JDK 11.0.2

 class StringReversal
 {
   
   public static void reversal(String str){
     
     char currentChar;
     String newStr = "";
     
     for(int i=0;i<str.length();i++){
       
       currentChar = str.charAt(i);
       newStr = currentChar+newStr;    
     }
     
     System.out.println("\n"+newStr);
     
   }
   
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter string: ");
    
    String input = sc.nextLine();
    
    reversal(input);
   }
 }
    