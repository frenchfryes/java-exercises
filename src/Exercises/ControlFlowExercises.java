package Exercises;

/**
 * Created by frenchfryes on 5/10/17.
 */
/*public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i < 16) {
            System.out.println(i);
            i++;
        }
    }
}*/

/*public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i + 2);
            i++;
        } while (i <= 100);
    }
}*/

public class ControlFlowExercises {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.print("fizzbuzz");
            else if ((i % 3) == 0) System.out.print("fizz");
            else if ((i % 5) == 0) System.out.print("buzz");
            else System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
