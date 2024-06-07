
import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc  = new Scanner (System.in);
        //Find and print the sum of three integers entered by the user
        int intVar01= sc.nextInt();
        int intVar02= sc.nextInt();
        int intVar03= sc.nextInt();
        int intTotal = intVar01+intVar02+intVar03;
        
        System.out.println("Soma eh " +intTotal);
        
        
        
        //Remember to close the Scanner
        
    }
}
