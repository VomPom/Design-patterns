package julis.wang.factory_method;

import julis.wang.simple_factory.ITransport;
import julis.wang.simple_factory.ShipTransport;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/12 10:07
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class ShipFactory implements IFactory {

    @Override
    public ITransport createTransport() {
        return new ShipTransport();
    }
}
