package Java2;

import java.util.Scanner;

/**
 * Created by frenchfryes on 5/17/17.
 */
public class Input {

    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

    public String getString(this.String) {
        return scan.nextLine();
    }

    public boolean yesNo() {
        string answer = this.getString();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        }

        return false;
    }
}