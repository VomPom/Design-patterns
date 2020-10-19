package julis.wang.composite;


/*******************************************************
 *
 * Created by julis.wang on 2020/10/19 19:46
 *
 * Description :组合模式:
 *              一种结构型设计模式， 可以使用它将对象组合成树状结构，
 *              并且能像使用独立对象一样使用它们。
 *              优缺点：
 *              优点：
 *              1、可以利用多态和递归机制更方便地使用复杂树结构
 *              2、 开闭原则。 无需更改现有代码， 就可以在应用中添加新元素， 使其成为对象树的一部分。
 *              缺点：
 *              1、对于功能差异较大的类，提供公共接口或许会有困难。
 *              在特定情况下，需要过度一般化组件接口，使其变得令人难以理解
 * History   :
 *
 *******************************************************/

public class CompositeDemo {
    public static void main(String[] args) {
        View view1 = new View("View1");
        View view2 = new View("View2");
        view1.draw();
        view2.draw();

        ViewGroup viewGroup1 = new ViewGroup("ViewGroup1");
        viewGroup1.addView(view1);
        viewGroup1.addView(view2);
        viewGroup1.draw();

        ViewGroup viewGroup2 = new ViewGroup("ViewGroup2");

        viewGroup2.addView(view1);
        viewGroup2.addView(viewGroup1);
        viewGroup2.draw();
    }
}
