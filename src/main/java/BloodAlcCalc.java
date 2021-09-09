/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class BloodAlcCalc {
    public static void main(String[] args) {
        int A, W, H, g;
        float r;
        double BAC;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        g = sc.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        A = sc.nextInt();
        System.out.print("What is your weight, in pounds? ");
        W = sc.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        H = sc.nextInt();
        sc.close();
        if(g == 1){
            r = (float) 0.73;
        }
        else{
            r = (float) 0.66;
        }
        BAC = (A * 5.14 / W * r) - (0.015 * H);
        System.out.printf("Your BAC is %.6f \n", BAC);
        if(BAC < 0.08){
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive.");
        }
    }
}
