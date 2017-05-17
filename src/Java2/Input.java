package Java2;

import java.util.Scanner;

/**
 * Created by frenchfryes on 5/17/17.
 */
public class Input {

        private final Scanner in;

        public Input(){in = new Scanner(System.in);}

        public  String getString() {
            System.out.println("Enter a string: ");
            return in.nextLine();
        }

        public boolean yesNo(){
            System.out.println("Continue: (Y/n)");
            return in.next().toLowerCase().equals("y");
        }

        public int getInt(int min, int max){
            int getValue;
            do{
                System.out.printf("Enter an Integer between %d and %d ", min, max);
                getValue = in.nextInt();
            }while(getValue < min || getValue > max);
            return getValue;
        }

        public int getInt(){
            System.out.println("Enter an Integer: ");
            return in.nextInt();
        }

        public double getDouble(double min, double max){
            double getValue;
            do{
                System.out.printf("Enter a decimal number between %.3f and %.3f", min, max);
                getValue = in.nextDouble();
            }while(getValue < min || getValue > max);
            return getValue;
        }
        public double getDouble(){
            System.out.println("Enter a decimal number: ");
            return in.nextDouble();
        }


    }
