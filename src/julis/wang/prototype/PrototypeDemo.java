package julis.wang.prototype;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 09:52
 *
 * Description :
 *          原型模式：
 *              是一种创建型设计模式， 使你能够复制已有对象， 而又无需使代码依赖它们所属的类。
 *
 *          优缺点：
 *              优点：
 *              1、可以克隆对象， 而无需与它们所属的具体类相耦合
 *              2、可以克隆预生成原型， 避免反复运行初始化代码
 *              3、可以更方便地生成复杂对象
 *              4、可以用继承以外的方式来处理复杂对象的不同配置。
 *              缺点：
 *              克隆包含循环引用的复杂对象可能会非常麻烦。
 *
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

        circleClone.color = "black";
        System.out.println("After change circleClone color is " + circleClone.color);
        System.out.println("After change Circle color is " + circle.color);


    }
}
