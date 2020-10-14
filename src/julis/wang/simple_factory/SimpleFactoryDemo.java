package julis.wang.simple_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/12 09:58
 *
 * Description :
 *              优缺点: 简单工厂模式实现了生成产品类的代码跟客户端分离，
 *              在工程类里面可以添加所需生成产品的逻辑。缺点是每次增加一种算法类型，
 *              都需要修改工厂类，不符合开闭原则。
 * History   :
 *
 *******************************************************/

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        ITransport shipTransport = TransportFactory.createTransport("ship");
        shipTransport.transport();
        ITransport carTransport = TransportFactory.createTransport("car");
        carTransport.transport();
    }
}