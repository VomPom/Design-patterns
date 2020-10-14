package julis.wang.builder;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 10:09
 *
 * Description :
 *          建造者模式，能够分步骤创建复杂对象。
 *          该模式允许使用相同的创建代码生成不同类型和形式的对象
 *
 *          优缺点：
 *              优点：
 *                  1、可以分步创建对象， 暂缓创建步骤或递归运行创建步骤
 *                  2、生成不同形式的产品时， 你可以复用相同的制造代码。
 *                  3、单一职责原则。 你可以将复杂构造代码从产品的业务逻辑中分离出来
 *              缺点：
 *                  由于该模式需要新增多个类， 因此代码整体复杂程度会有所增加。
 *
 * History   :
 *
 *******************************************************/

public class BuilderDemo {
    public static void main(String[] args) {
        MIPhoneBuilder builder = new MIPhoneBuilder();

        builder
                .setCard("mi card")
                .setColor(0x1234)
                .setCPU("mi cpu");

        MiPhone miPhone = builder.buildPhone();
        System.out.println(miPhone.toString());
    }
}
