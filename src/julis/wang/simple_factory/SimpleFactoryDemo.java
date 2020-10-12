package julis.wang.simple_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/12 09:58
 *
 * Description :
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
