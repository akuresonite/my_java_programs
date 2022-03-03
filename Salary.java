import java.util.*;

public class Salary {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        double salary = in.nextDouble();
        
        if(salary>8000){
            System.out.println("Salary too large");
        }
        else if(salary<0){
            System.out.println("Salary too small");
        }
        else if(salary>0 && salary<8000){
            
            double shifts = in.nextDouble();
            
            if(shifts<0){
                System.out.println("Shift too small");
            }
            else{
              double foodExp;
                double travelExp;
                double shiftsEarnings;
                double savings;
                
                foodExp = salary*0.2;
                travelExp = salary*0.3;
                shiftsEarnings = shifts*salary*0.02;
                savings = shiftsEarnings + (salary-foodExp-travelExp);
                
                System.out.println(savings);
            }
        }
        
    }
}