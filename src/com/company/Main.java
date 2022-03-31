package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num = getInput();//gets input from user
        int sum = 0;
        int temp = num;
        while (temp > 0) {//while loop to get the sum of the digits
            int digit = temp % 10;
            sum += digit * digit * digit;   
            temp /= 10;
        }
        if (num == sum) {   //if statement to check if the number is a armstrong number
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is not an armstrong number");
        }
    }
    public static int getInput() {  //method to get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        return scanner.nextInt();
    }
}
