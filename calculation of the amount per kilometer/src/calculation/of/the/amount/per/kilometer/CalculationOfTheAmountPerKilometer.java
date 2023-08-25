/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation.of.the.amount.per.kilometer;

import java.util.Scanner;

/**
 *
 * @author sueda
 */
public class CalculationOfTheAmountPerKilometer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("How many liters of gasoline does your "
                + "car spend per kilometer? (for example: 16,70): ");
        double gasoline=scanner.nextDouble();
        
        System.out.print("How many kilometers do you travel on "
                + "average per day? : " );
        double kilometer=scanner.nextDouble();
        
        double total= (gasoline*kilometer);
        System.out.println("Your average gas consumption in a day: " + total);
        
    }
    
}
