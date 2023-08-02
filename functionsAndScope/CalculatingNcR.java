package FunctionsAndScope;
import java.util.Scanner;
public class CalculatingNcR {
    // Repititive
    //Readability
    
    // this code is basically without any function
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n  = s.nextInt();
       int r  = s.nextInt();
       // m using function --> basically here i am calling the function.
       int factN = factorial(n);
       int factR = factorial(r);
       int factNR = factorial(n-r);

    //    int factN = 1;
    //    for( int i = 1; i <=n ; i ++){
    //     factN = factN*i;
    //    }
    //    int factR = 1;
    //     for( int i = 1; i <=r ; i ++){
    //     factR = factR*i;
    //    }
    //    int factNR = 1;
    //    for(int i  =1 ; i <= n - r ; i++){
    //     factNR = factNR*i;
    //    }
       int result  = factN / (factR*factNR);
       System.out.print(result);    
    }
    // Syntax of writing a function
    //  public static data type function name (input parameters)

    // now i am writing a code with the help of function
    public static int factorial(int num){
         int fact = 1;
       for( int i = 1; i <=num; i ++){
        fact = fact*i;
       }
       return fact;
    }

}
