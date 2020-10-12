package julis.wang.factory_method;

import julis.wang.simple_factory.CarTransport;
import julis.wang.simple_factory.ITransport;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/12 10:07
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class CarFactory implements IFactory {

    @Override
    public ITransport createTransport() {
        return new CarTransport();
    }
}
