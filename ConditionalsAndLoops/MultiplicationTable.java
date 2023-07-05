package ConditionalAndLoops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     for(int i = 1 ; i < 11 ; i++){
        int a = n*i;
        System.out.println(a);
     }
    }
}
