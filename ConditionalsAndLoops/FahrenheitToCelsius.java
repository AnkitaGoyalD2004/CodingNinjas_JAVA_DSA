package ConditionalAndLoops;
import java.util.Scanner;
public class FahrenheitToCelsius {
    Scanner s = new Scanner(System.in);
    int S = s.nextInt();
    int E = s.nextInt();
     int W = s.nextInt();
    while(S <= E){
        int  fah = ((5*(S-32))/9);
        System.out.print(S +" "+ fah);
        S+= W;
    }
}
