package Java2;

import java.util.Random;

/**
 * Created by frenchfryes on 5/18/17.
 */
public class NameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"awesome", "clean", "loving", "dirty", "blue", "thoughtful", "immaculate", "bogus", "friendly", "fake"};
        String[] nouns = {"News", "School", "Tom", "Derek", "White House", "Trump", "Washington", "Attorney", "Teacher", "Student"};

        Random random = new Random();
        int i = random.nextInt(10);


        System.out.println(adjectives[i] + "-" + nouns[i]);

    }
}
