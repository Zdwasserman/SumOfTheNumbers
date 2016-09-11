package Wasserman.Zachary.SumOfTheNumbers;

import java.util.Scanner;
public class SumOfTheNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int counter = 0;
        int sum = 0;
        while (counter <= n) {
            sum = counter + sum;
            counter++;
        }
        System.out.println(sum);
        System.out.println("End of program");

    }
}
