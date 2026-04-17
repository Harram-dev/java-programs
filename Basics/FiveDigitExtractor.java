/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.harram.five.digit.extractor;
import java.util.Scanner;
public class FiveDigitExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Enter a 5-digit number: ");  
    int num = scanner.nextInt();  

    int tenThousands = num / 10000;  
    int thousands = (num / 1000) % 10;  
    int hundreds = (num / 100) % 10;  
    int tens = (num / 10) % 10;  
    int ones = num % 10;  

    System.out.println("The ten-thousands value is: " + tenThousands);  
    System.out.println("The thousands value is: " + thousands);  
    System.out.println("The hundreds value is: " + hundreds);  
    System.out.println("The tens value is: " + tens);  
    System.out.println("The ones value is: " + ones); 
     
    
    }
}
