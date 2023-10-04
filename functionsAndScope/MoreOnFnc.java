package FunctionsAndScope;
import java.util.Scanner;

public class MoreOnFnc {
    // Sum of two numbers

    public static int Sum(int a  , int b){
        int c  = a + b ;
        return c;
    }
    // public static void main(String[]args){
    //  Scanner s  = new Scanner(System.in);
    //  int t = s.nextInt();
    //  int d  = s.nextInt();
    //  int td = Sum(t , d);
    //  System.out.print(td);
    // }

    // print Even numbers
    public static void Even(){
        for(int i = 1 ; i <= 100 ; i++){
         if(i%2 == 0 ){
            System.out.print(i);
         }
        }
    }
    public static void main(String[] args){
       Even();
        
    }

}
