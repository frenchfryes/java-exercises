package Exercises;

import java.util.Scanner;

/**
 * Created by frenchfryes on 5/8/17.
 */
/*public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite number?");
        int favnum = scan.nextInt();
        System.out.println("Your favorite number is " + favnum);

    }

}*/
/*public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what are your 3 favorite food items?");
        String favfood = scan.nextLine();
        System.out.println("Your 3 favorite food items are " + favfood + favfood2 + favfood3)
    }
}*/

/*public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String dogname = scan.nextLine();
        System.out.println("Your dog's name is " + dogname);

        System.out.println("What is your sister's name?");
        String sisname = scan.nextLine();
        System.out.println("Your dog's name is " + dogname + " and your sister's name is " + sisname);

        System.out.println("What is your dad's name?");
        String dadname = scan.nextLine();
        System.out.println("Your dog's name is " + dogname + ", your sister's name is " + sisname + " and your dad's name is " + dadname);


    }
}*/

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the width of the room in feet?");
        int width = scan.nextInt();
        System.out.println("What is the length of the room in feet?");
        int length = scan.nextInt();
        System.out.println("The area of the room is " + (length * width) + "feet" + " while the perimeter is " + ((2 * length) + (2 * width)) + "feet");
    }
}
