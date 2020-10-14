package julis.wang.abstract_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 09:46
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class MacButton implements IButton {
    @Override
    public void onClick() {
        System.out.println("Mac button onClick.");
    }
}
