package julis.wang.simple_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/10 10:19
 *
 * Description :
 *
 * History   :
 *
 *******************************************************/

public class TransportFactory {
    public static ITransport createTransport(String type) {
        switch (type) {
            case "car":
                return new CarTransport();
            default:
                return new ShipTransport();
        }

    }

}
