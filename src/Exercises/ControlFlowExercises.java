package Exercises;

import java.util.Scanner;

/**
 * Created by frenchfryes on 5/10/17.
 */
/*WHILE LOOP*/

/*public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i < 16) {
            System.out.println(i);
            i++;
        }
    }
}*/

/*DO WHILE*/
/*public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        } while (i < 100);
        System.out.println(i);
        do {
            i -= 5;
            System.out.println(i);
        } while (i > -10);

        long x;
        for (x = 2; x <= 1000000; x *= x) {
            System.out.println(x);
        }
    }
}*/
/*FIZZ BUZZ*/
        /*public class ControlFlowExercises {
            public static void main(String[] args) {
                for (int i = 1; i <= 100; i++) {
                    if (((i % 3) == 0) && ((i % 5) == 0))
                        System.out.print("fizzbuzz");
                    else if ((i % 3) == 0) System.out.print("fizz");
                    else if ((i % 5) == 0) System.out.print("buzz");
                    else System.out.print(i);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }*/

/*TABLE OF POWERS*/

        /*public class ControlFlowExercises {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("What would you like to go up to?");

                int num = scan.nextInt();
                Scanner sc = new Scanner(System.in);
                System.out.print("Continue? [y/N] ");
                String userInput = sc.nextLine();
                boolean noConfirmation = userInput.equals("N");
                boolean confirmation = userInput.equals("y");
                if (noConfirmation) {
                    System.out.print("goodbye");
                } else if (confirmation) {
                    System.out.println("number | squared | cubed");
                    System.out.println("------ | ------- | -----");
                    for (int i = 1; i <= num; i++) {
                        int squared = i * i;
                        int cubed = i * i * i;
                        System.out.println("   " + i + "   |   " + squared + "     |   " + cubed + " ");
                    }
                }
            }
        }

*//*Letter Grades*//*
        public class ControlFlowExercises {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String contGrade = "y";
                while (contGrade.equalsIgnoreCase("y")) {
                    System.out.println("Please enter a numerical grade:");
                    int grade = scan.nextInt();
                    if (grade <= 100 && grade >= 88) {
                        System.out.println("You have an A!");
                    } else if (grade <= 87 && grade >= 80) {
                        System.out.println("You have a B.");
                    } else if (grade <= 79 && grade >= 67) {
                        System.out.println("You have a C.");
                    } else if (grade <= 66 && grade >= 60) {
                        System.out.println("You have a D.");
                    } else {
                        System.out.println("You hava a F. :(");
                    }
                    System.out.println("Would you like to check another grade? Y/N");
                    contGrade = scan.next();
                }
                System.out.println("Thank you, get lost!");

            }
        }
*/