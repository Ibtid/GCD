package gcd;

import java.util.Scanner;

public class GCD {

    int largerNumber, smallerNumber,remainder;
    
    void initializeNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the larger number:");
        largerNumber =  scan.nextInt();
        System.out.println("Enter the smaller number:");
        smallerNumber = scan.nextInt();
    }
    
    
    int getGCD(){
        while(smallerNumber != 0){
            remainder = largerNumber % smallerNumber;
            largerNumber = smallerNumber;
            smallerNumber = remainder;
        }
        
        return largerNumber;
    }
    
    
}
