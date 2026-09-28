import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       int input = sc.nextInt();
       int take = input;
       while(input>=1)
       {
        System.out.print(take-(input-1)+" ");
        input = input-1;

       }
        
    }
}