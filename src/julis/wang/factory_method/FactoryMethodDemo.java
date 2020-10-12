package julis.wang.factory_method;

import julis.wang.simple_factory.ITransport;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/12 10:10
 *
 * Description :工厂方法中，我们把生成算法实现类的时间延迟，
 *              通过对应的工厂来生成对应的算法类，这样就做到了无论需要增加多少算法实现类，
 *              都可以通过增加工厂实现类来实现，这种设计方式符合 “开闭”原则。
 *              缺点就是当算法过多的时候，需要定义很多算法对应的工厂类。
 *
 * History   :
 *
 *******************************************************/

public class FactoryMethodDemo {
    public static void main(String[] args) {
        IFactory carFactory = new CarFactory();
        ITransport carTransport = carFactory.createTransport();
        carTransport.transport();

        IFactory shipFactory = new ShipFactory();
        ITransport shipTransport = shipFactory.createTransport();
        shipTransport.transport();
    }
}
