
package com.harram.bmicalculator;
import java.util.Scanner;
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weightKg = 0;
        double heightMeters = 0;

        System.out.println("Choose weight unit:");
        System.out.println("1. Kilograms");
        System.out.println("2. Pounds");
        int weightChoice = scanner.nextInt();

        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        switch (weightChoice) {
            case 1:
                weightKg = weight;
                break;
            case 2:
                weightKg = weight * 0.453592;
                break;
            default:
                System.out.println("Invalid weight choice");
                return;
        }
        System.out.println("\nChoose height unit:");
System.out.println("1. Feet & Inches");
System.out.println("2. Meters");
System.out.println("3. Inches");
int heightChoice = scanner.nextInt();

switch (heightChoice) {
    case 1:
        System.out.print("Enter feet: ");
        int feet = scanner.nextInt();

        System.out.print("Enter inches: ");
        int inches = scanner.nextInt();

        heightMeters = (feet * 0.3048) + (inches * 0.0254);
        break;

    case 2:
        System.out.print("Enter height in meters: ");
        heightMeters = scanner.nextDouble();
        break;

    case 3:
        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();

        heightMeters = heightInches * 0.0254;
        break;

    default:
        System.out.println("Invalid height choice");
        return;
}
  
        double bmi = weightKg / (heightMeters * heightMeters);

        if (bmi < 18.5) 
        {
            System.out.println ("Your bmi is:" + bmi);
            System.out.println ("Category: Underweight");
            
        } 
        else
            if (bmi >= 18.5 && bmi <= 24.9) 
        {
            System.out.println ("Your bmi is:" + bmi);
            System.out.println ("Category: Normal");
        }
        else 
            if (bmi >= 25 && bmi <= 29.9) 
        {
            System.out.println ("Your bmi is:" + bmi);
            System.out.println ("Category: Overweight");
        } 
        else 
        {
            System.out.println ("Your bmi is:" + bmi);
            System.out.println ("Category: Obese");
        }
    
    }
}
