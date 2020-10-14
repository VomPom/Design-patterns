package julis.wang.abstract_factory;

/*******************************************************
 *
 * Created by julis.wang on 2020/10/14 09:47
 *
 * Description :
 * History   :
 *
 *******************************************************/

public class WindowsButton implements IButton {
    @Override
    public void onClick() {
        System.out.println("Windows button onClick.");
    }
}
