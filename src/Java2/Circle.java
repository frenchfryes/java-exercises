package Java2;

/**
 * Created by frenchfryes on 5/17/17.
 */
public class Circle {

        private double radius;
        public Circle(double radius){this.radius = radius;}
        public double getArea(){return Math.PI * Math.pow(this.radius, 2f);}
        public double getCircumference(){return Math.PI * this.radius * 2;}
}
