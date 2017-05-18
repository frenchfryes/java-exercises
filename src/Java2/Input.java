package Java2;

import java.util.Scanner;

/**
 * Created by frenchfryes on 5/17/17.
 */
public class Input {

    private Scanner scan;
    private Scanner input;

    public Input(Scanner userInput){
        this.input = new Scanner(System.in);
    }

    public Input(){
        this.input = new Scanner(System.in);
    }

    public String getString(){
        return input.nextLine();
    }

    public boolean yesNo(){
        String answer = this.getString();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }

    public int getInt(int min, int max) {
        int answer = this.getInt();
        if (answer < min || answer > max){
            System.out.println("Number out of range, try again");
            getInt(min, max);
            input.nextInt();
            return answer;
        }
        System.out.println("Correct");
        return answer;
    }

    public int getInt(){
        return input.nextInt();
    }

    public double getDouble(double min, double max){
        double answer = this.getDouble();
        if (answer < min || answer > max){
            System.out.println("Number out of range, try again");
            getDouble(min, max);
            input.nextDouble();
            return answer;
        }
        System.out.println("Correct");
        return answer;
    }

    public double getDouble(){
        return input.nextDouble();
    }
}