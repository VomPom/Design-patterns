package julis.wang.factory_method;

import julis.wang.simple_factory.ITransport;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/12 10:06
 *
 * Description :
 * History   :
 *
 *******************************************************/

public interface IFactory {
    ITransport createTransport();
}
