package ConditionalAndLoops;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
     int basicSalary = s.nextInt();
     char grade = s.next().charAt(0);
    double hra  = 0.2*basicSalary;
     double da = 0.5*basicSalary;
     double pf = 0.11*basicSalary;
     double allow;

     if(grade == 'A'){
        allow = 1700;
     }else if(grade == 'B'){
        allow = 1500;
     }else{
        allow = 1300;
     }
     double  totalSalary = basicSalary + hra + da + allow - pf;
     int roundSalary = (int)Math.round(totalSalary);
     System.out.print(roundSalary);
}
}
