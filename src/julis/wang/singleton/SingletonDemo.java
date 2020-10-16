package julis.wang.singleton;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/15 09:43
 *
 * Description :
 *              单例模式：
 *                  是一种创建型设计模式， 让你能够保证一个类只有一个实例，
 *                  并提供一个访问该实例的全局节点。
 *
 *               优缺点：
 *                  优点：
 *                  1、保证一个类只有一个实例。
 *                  2、获得了一个指向该实例的全局访问节点
 *                  3、仅在首次请求单例对象时对其进行初始化
 *                  缺点：
 *                  1、违反了单一职责原则， 该模式同时解决了两个问题
 *                  2、单例模式可能掩盖不良设计， 比如程序各组件之间相互了解过多等
 *                  3、 该模式在多线程环境下需要进行特殊处理， 避免多个线程多次创建单例对象。
 *                  4、单例的客户端代码单元测试可能会比较困难， 因为许多测试框架以基于继承的方式创建模拟对象。
 *                  由于单例类的构造函数是私有的， 而且绝大部分语言无法重写静态方法，
 *                  所以需要想出仔细考虑模拟单例的方法。 要么干脆不编写测试代码， 或者不使用单例模式。
 *
 * History   :
 *
 *******************************************************/

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.speak();

        Singleton instance2 = Singleton.getInstance();
        instance2.speak();

        Singleton instance3 = Singleton.getInstance();
        instance3.speak();

        System.out.println(instance == instance2);
        System.out.println(instance2 == instance3);
        System.out.println(instance == instance3);
    }
}
