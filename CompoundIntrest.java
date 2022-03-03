import java.util.*;

public class CompoundIntrest {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter deposite amount: ");
        double pAmount = sc.nextDouble();
        
        if(pAmount > 0){
            System.out.println("Enter per year coumpound intrest rate: ");
        double intrest = sc.nextDouble();
        
        if(intrest > 0){
             System.out.println("Enter years: ");
        int years = sc.nextInt();
        
        if( years > 0){
            compoundAmount(pAmount,intrest,years);
        }
            else{
                System.out.println("! Invalid year");
            }
        }
            else{
                System.out.println("! Invalid intrest rate");
            }
        }
        else{
            System.out.println("! Invalid amount");
        }
    }
    
    public static void compoundAmount(double P, double r, int y){
        
        double finalAmount  = P * Math.pow((1+r/100),y);
        
        //System.out.println("Your principal amount "+P+" will become\n"+finalAmount+" in "+y+" years.");
        System.out.format("Your principal amount %.3f%n will become\n %.3f%n in "+y+" years", P, finalAmount);
    }
}