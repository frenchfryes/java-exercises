package Java2;

/**
 * Created by frenchfryes on 5/18/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        Input entry = new Input();

        System.out.println("Give me the radius");
        double radius = entry.getDouble();

        Circle c = new Circle(radius);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }

}
