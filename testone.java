import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter 1st number");
    int num1 = input1.nextInt();
    //System.out.println(num1);
   // input1.close();
   Scanner input3 = new Scanner(System.in);
   System.out.println("+ -> a\n- -> s\n* -> m\n÷ -> d");
   String oper = input3.nextLine();
   System.out.println(oper);
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter 2nd number");
    int num2 = input2.nextInt();
   // System.out.println(num2);
  //input2.close();
  System.out.println(oper);
  int sum = num1+num2;
   
   if(oper == "a"){
     System.out.println(sum);
   //System.out.println(num1+"+"+num2+"="+(num1 + num2));
   }
   else{
     System.out.print("invalid");
   }
  }
}