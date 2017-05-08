package Exercises;

import java.util.Scanner;

/**
 * Created by frenchfryes on 5/8/17.
 */
public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite number?");
        int favnum = scan.nextInt();
        System.out.println("Your favorite number is " + favnum);

    }
}