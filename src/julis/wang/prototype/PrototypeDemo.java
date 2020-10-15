package julis.wang.prototype;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 09:52
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class PrototypeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.color = "blue";
        rectangle.x = 5;
        rectangle.y = 10;
        rectangle.height = 100;
        rectangle.width = 120;

        Rectangle rectangleClone = (Rectangle) rectangle.clone();
        System.out.println("Rectangle equals rectangleClone -- > " + rectangleClone.equals(rectangle));
        System.out.println("Rectangle == circleClone -- > " + (rectangleClone == rectangle));




        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        Circle circleClone = (Circle) circle.clone();

        System.out.println("Circle equals circleClone -- > " + circleClone.equals(circle));
        System.out.println("Circle == circleClone -- > " + (circleClone == circle));



        System.out.println("Circle color is " + circle.color);
        System.out.println("Clone circle color is " + circleClone.color);
        System.out.println("Clone circle color is " + circleClone.color);


    }
}
