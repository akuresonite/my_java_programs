import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter 1st number");
    int num1 = input1.nextInt();
    //System.out.println(num1);
   // input1.close();
   Scanner input3 = new Scanner(System.in);
   System.out.println("+ -> a\n- -> s\n* -> m\n÷ -> d\n√x -> p\n! -> f");
   String oper = input3.nextLine();
  // System.out.println(oper);
   // System.out.println(num1+" "+oper);
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter 2nd number");
    int num2 = input2.nextInt();
   // System.out.println(num2);
  //input2.close();
 // System.out.println(oper);
  //int sum = num1+num2;
    //System.out.println(num1+" "+oper+" "+num2);
   // System.out.println("equals to");
   int f = 1;
   
   switch(oper){
     case "a": System.out.println(num1+"+"+num2+"="+(num1+num2));
     break;
     case "s": System.out.println(num1+"-"+num2+"="+(num1-num2));
     break;
     case "m": System.out.println(num1+"*"+num2+"="+(num1*num2));
     break;
     case "d": System.out.println(num1+"/"+num2+"="+(num1/num2));
     break;
     case "p": System.out.println("√"+num1+"="+ Math.sqrt(num1));
     break;
     case "f": for(int i=1;i<=num1;i++){
                 f = f*i;
     }
              System.out.println(num1+"! = "+f);
     break;
     default: System.out.println("invalid operator");
   }
  }
}