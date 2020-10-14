package julis.wang.abstract_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 09:52
 *
 * Description :
 *           抽象工厂模式是一种创建型设计模式， 它能创建一系列相关的对象， 而无需指定其具体类。
 *
 *           优缺点：
 *               优点：
 *                   1、确保同一工厂生成的产品相互匹配。
 *                   2、避免客户端和具体产品代码的耦合。
 *                   3、单一职责原则。 将产品生成代码抽取到同一位置，使得代码易于维护。
 *                   4、开闭原则。 向应用程序中引入新产品变体时，无需修改客户端代码。
 *                缺点：
 *                   由于采用该模式需要向应用中引入众多接口和类，代码可能会比之前更加复杂
 *
 * History   :
 *
 *******************************************************/

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        MacFactory macFactory = new MacFactory();
        Application macApplication = new Application(macFactory);
        macApplication.draw();

        WindowsFactory windowsFactory = new WindowsFactory();
        Application winApplication = new Application(windowsFactory);
        winApplication.draw();
    }
}
