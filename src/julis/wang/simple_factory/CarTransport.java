package julis.wang.simple_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/12 09:52
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class CarTransport implements ITransport {
    @Override
    public void transport() {
        System.out.println("Car offer.");
    }
}
